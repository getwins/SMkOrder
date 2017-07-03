import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;


import entity.PdClich;
import entity.PdEntrust;
import entity.PdGit;
import util.HibernateUtil;

public class MkRecord {
	private SanitySystemIn inData;
	private Session session;
	private PdGit git;
	PdEntrust entrust;
	
	MkRecord(SanitySystemIn inData){
		this.inData = inData;
		this.session = HibernateUtil.getSession();
	}
	
	public boolean checkGit(){
		return false;
	}
	
	public void addEntrust(){
		entrust = new PdEntrust();
		entrust.setMemberId(inData.getMember().getId());
		entrust.setContrctId(inData.getContrct().getId());
		entrust.setNum(inData.getNum());
		entrust.setClienhNum(inData.getNum());
		entrust.setPrice(inData.getEntrustPrice());
		entrust.setPath((short)inData.getPath());
		entrust.setOpenClose((short)inData.getOpenClose());
		entrust.setSta((short)1);
		entrust.setCreatTime(inData.getEntrustTime());
		entrust.setGitId(git.getId());
		entrust.setOpenprice(inData.getEntrustPrice());
		entrust.setTradetype(0);
		entrust.setOrdertype(0);
		session.persist(entrust);
		session.save(entrust);
	}
	
	
	public void addClich() throws Exception{
		PdClich clich = new PdClich();
		clich.setEntrustId(entrust.getId());
		clich.setMemberId(inData.getMember().getId());
		clich.setPrice(inData.getTradePrice());
		clich.setNum(inData.getNum());
		clich.setCreatTime(inData.getTradeTime());
		clich.setClosedNum(0);
		clich.setPc((short)inData.getOpenClose());
		clich.setFees(25);
		clich.setYk(new BigDecimal(0.0));
		clich.setMultiplier((int)inData.getContrct().getMultiplier());
		clich.setOpenprice(0);
		clich.setOpenEntrustId(0);
		if(clich.getPc() == 1){
			PdEntrust openEntrust = null;
			
			String hql;
			hql = "select e from PdEntrust e where e.memberId = :memberId"
					+ "and e.contrctId = :contrctId"
					+ "and e.pc = 0"
					+ "and e.num = :num";
			List<PdEntrust> entrusts = null;
			entrusts = session.createQuery(hql)
					.setParameter("memberId", inData.getMember().getId())
					.setParameter("contrctId", inData.getContrct().getId())
					.setParameter("num", inData.getNum())
					.getResultList();
			if(entrusts == null){
				hql = "select e from PdEntrust e where e.memberId = :memberId"
						+ "and e.contrctId = :contrctId"
						+ "and e.pc = 0"
						+ "and e.num > :num";
				entrusts =  session.createQuery(hql)
						.setParameter("memberId", inData.getMember().getId())
						.setParameter("contrctId", inData.getContrct().getId())
						.setParameter("num", inData.getNum())
						.getResultList();
				
			}
			
			if(entrusts == null)
				throw new Exception("找不到对应的开仓委托");
		
			openEntrust = entrusts.get(0);
			if(inData.getPath() == 1){
				double yk = (inData.getTradePrice() - inData.getEntrustPrice()) * inData.getNum() * inData.getMember().getMultiplier1();
				clich.setYk(new BigDecimal(yk));
			}
			else{
				double yk = (inData.getEntrustPrice() - inData.getTradePrice()) * inData.getNum() * inData.getMember().getMultiplier1();
				clich.setYk(new BigDecimal(yk));
			}
	
			clich.setOpenprice(inData.getEntrustPrice());
			clich.setOpenEntrustId(0);
		}
	}
	
	public void addOrUpdateGit() throws Exception{
		String hql = "select g from PdGit g where g.memberId = :memberId "
				+ "and g.contrctId = :contrctId"
				+ "and g.path = :path";
		
		if(inData.getOpenClose() == 0 ){
			Query query = session.createQuery(hql)
				.setParameter("memberId", inData.getMember().getId())
				.setParameter("contrctId", inData.getContrct().getId())
				.setParameter("path", (short)inData.getPath());
			List<PdGit> gits =  query.getResultList();
			if(gits != null)
				git = gits.get(0);
			
			if(git == null){
				git = new PdGit();
				git.setMemberId(inData.getMember().getId());
				git.setContrctId(inData.getContrct().getId());
				git.setNum(inData.getNum());
				git.setLockNum(0);
				git.setPath((short)inData.getPath());
				git.setPrice(inData.getTradePrice());
				session.persist(git);
			}
			else{
				git.setNum(git.getNum() + inData.getNum());
			}
		
		}
		else{
			int openPath = inData.getPath() == 0 ? 1 : 0;
			Query query = session.createQuery(hql)
					.setParameter("memberId", inData.getMember().getId())
					.setParameter("contrctId", inData.getContrct().getId())
					.setParameter("path", (short)openPath);
			List<PdGit> gits =  query.getResultList();
			if(gits == null)
				throw new Exception("找不到对应的持仓");
			
			git = gits.get(0);
			if(git.getNum() - git.getLockNum() < inData.getNum())
				throw new Exception("持仓不足");
			
			git.setNum(git.getNum() - inData.getNum());
		}
	}
	
	public void mkRecord() throws Exception{
		addOrUpdateGit();
		addEntrust();
		addClich();
	}
}
