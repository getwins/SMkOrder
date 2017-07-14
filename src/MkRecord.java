import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.PdClich;
import entity.PdCurrency;
import entity.PdEntrust;
import entity.PdGit;
import entity.PdGitprice;
import entity.PdMarket;
import util.HibernateUtil;

public class MkRecord {
	private SanitySystemIn inData;
	private Session session;
	private PdGit git;
	private PdEntrust entrust;
	//private PdGitprice gitprice;
	private PdClich clich;
	
	MkRecord(SanitySystemIn inData){
		this.inData = inData;
		this.session = HibernateUtil.getSession();
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
		
		if(inData.getOpenClose() == 0)
			entrust.setOpenprice(0.0);
		else
			entrust.setOpenprice(inData.getOpenPrice());
		
		entrust.setTradetype(1);
		entrust.setOrdertype(0);
		session.persist(entrust);
		session.save(entrust);
		
	}
	
//	public void manipulateGitprice() throws Exception{	
//		if(inData.getOpenClose() == 0){
//			gitprice = new PdGitprice();
//			gitprice.setGitId(git.getId());
//			gitprice.setPrice(entrust.getPrice());
//			gitprice.setNum(entrust.getNum());
//			gitprice.setPath(inData.getPath());
//			gitprice.setCode(inData.getContrct().getContractNo());
//			gitprice.setEntrustId(entrust.getId());
//			gitprice.setMemberId(0);
//			gitprice.setMarketId(inData.getContrct().getMarketId());
//			gitprice.setAuto(0);
//			session.persist(gitprice);
//			session.save(gitprice);
//			System.out.println("新增持仓价格记录" + gitprice.toString());
//			//gitprice.setMemberId(inData.getMember().getId());
//			//session.save(gitprice);
//			//System.out.println("更新持仓价格记录" + gitprice.toString());
//		}
//		else{
//			int openPath = (inData.getPath() == 0 ? 1 :0);
//			String hql = "select g from PdGitprice g where g.gitId = :gitId "
//					+ " and g.path = :path "
//					+ " and g.code = :code "
//					+ " and g.num = :num "
//					+ " and g.memberId = :memberId"
//					
//					//+ " and g.entrustId = :entrustId"
//					;
//			List<PdGitprice> list = session.createQuery(hql)
//					.setParameter("gitId", git.getId())
//					.setParameter("path", openPath)
//					.setParameter("code", inData.getContrct().getContractNo())
//					.setParameter("num", inData.getNum())
//					.setParameter("memberId", inData.getMember().getId())
//					//.setParameter("entrustId", openEntrust.getId())
//					.list();
//			if(list.isEmpty())
//				throw new Exception("找不到对应的持仓价格记录");
//			
//			gitprice = list.get(0);
//			session.delete(gitprice);
//			System.out.println("删除持仓价格记录" + gitprice.toString());	
//		}
//	}
	
	public void addClich() throws Exception{
		clich = new PdClich();
		clich.setEntrustId(entrust.getId());
		clich.setMemberId(inData.getMember().getId());
		clich.setPrice(inData.getTradePrice());
		clich.setNum(inData.getNum());
		clich.setCreatTime(inData.getTradeTime());
		clich.setClosedNum(0);
		clich.setPc((short)inData.getOpenClose());
		clich.setFees(inData.getContrct().getFees());
		clich.setYk(new BigDecimal(0.0));
		clich.setMultiplier((int)inData.getContrct().getMultiplier());
		clich.setOpenprice(0);
		clich.setOpenEntrustId(0);
		if(clich.getPc() == 1){	
			String hql;
			hql = "select e from PdEntrust e where e.memberId = :memberId"
					+ " and e.contrctId = :contrctId"
					+ " and e.path = :path"
					+ " and e.openClose = 0"
					+ " and e.num = :num"
					+ " order by e.num asc";
			short openPath = (short) (inData.getPath() == 0 ? 1 :0);
			List<PdEntrust> entrusts = null;
			entrusts = session.createQuery(hql)
					.setParameter("memberId", inData.getMember().getId())
					.setParameter("contrctId", inData.getContrct().getId())
					.setParameter("num", inData.getNum())
					.setParameter("path", openPath)
					.list();
			if(entrusts.isEmpty())
				throw new Exception("找不到对应的开仓委托");

			PdEntrust openEntrust = entrusts.get(0);
			System.out.println("找到开仓对应的委托" + openEntrust.toString());
			
			//PdEntrust openEntrust = (PdEntrust) session.load(PdEntrust.class, gitprice.getEntrustId());
			//System.out.println("找到开仓对应的委托" + openEntrust.toString());
			
			PdMarket market = (PdMarket) session.load(PdMarket.class, inData.getContrct().getMarketId());
			System.out.println(market.toString());
			
			PdCurrency currency = (PdCurrency) session.load(PdCurrency.class, (int)market.getExchange());
			System.out.println(currency);
			
			double yk = 0.0;
			if(inData.getPath() == 1){
				yk = (inData.getTradePrice() - inData.getOpenPrice()) * inData.getNum() * inData.getContrct().getMultiplier();
			}
			else{
				yk = (inData.getOpenPrice() - inData.getTradePrice()) * inData.getNum() * inData.getContrct().getMultiplier();		
			}
			yk /= currency.getExchangeUsd();
			
			clich.setYk(new BigDecimal(yk));
			clich.setOpenprice(inData.getOpenPrice());
			clich.setOpenEntrustId(openEntrust.getId());
		}
		session.persist(clich);
		session.save(clich);
	}
	
	public void addOrUpdateGit() throws Exception{
		String hql = "select g from PdGit g where g.memberId = :memberId "
				+ " and g.contrctId = :contrctId "
				+ " and g.path = :path";
		
		if(inData.getOpenClose() == 0 ){
			Query query = session.createQuery(hql)
				.setParameter("memberId", inData.getMember().getId())
				.setParameter("contrctId", inData.getContrct().getId())
				.setParameter("path", (short)inData.getPath());
			List<PdGit> gits =  query.list();
	
			if(gits.isEmpty()){
				git = new PdGit();
				git.setMemberId(inData.getMember().getId());
				git.setContrctId(inData.getContrct().getId());
				git.setNum(inData.getNum());
				git.setLockNum(0);
				git.setPath((short)inData.getPath());
				git.setPrice(inData.getTradePrice());
				session.persist(git);
				//session.save(git);
			}
			else if(gits.size() == 1){
				git = gits.get(0);
				git.setPrice(inData.getTradePrice());
				git.setNum(git.getNum() + inData.getNum());
			}
			else{
				throw new Exception("找到大于1 的持仓记录");
			}
		
		}
		else{
			int openPath = inData.getPath() == 0 ? 1 : 0;
			Query query = session.createQuery(hql)
					.setParameter("memberId", inData.getMember().getId())
					.setParameter("contrctId", inData.getContrct().getId())
					.setParameter("path", (short)openPath);
			List<PdGit> gits =  query.list();
			if(gits.isEmpty())
				throw new Exception("找不到对应 的持仓记录");
			if(gits.size() > 1)
				throw new Exception("找到大于1 的持仓记录");
			git = gits.get(0);
			if(git.getNum() - git.getLockNum() < inData.getNum())
				throw new Exception("持仓不足");
			
			git.setNum(git.getNum() - inData.getNum());
		}
		session.save(git);
	}
	
	public void mkRecord() throws Exception{
		Transaction tx = session.beginTransaction();
		try{
			addOrUpdateGit();
			System.out.println("保存持仓成功" + git.toString());
			
			addEntrust();
			System.out.println("保存委托成功" + entrust.toString());
			
			//manipulateGitprice();
			//System.out.println("操作持仓价格成功");
			
			addClich();
			System.out.println("保存成交成功" + clich.toString());
		}
		catch (Exception err){
			tx.rollback();
			throw err;
		}
		tx.commit();
		
//		tx = session.beginTransaction();
//		if(inData.getOpenClose() == 0){
//			gitprice.setMemberId(inData.getMember().getId());
//			session.save(gitprice);
//			System.out.println("更新持仓价格记录" + gitprice.toString());
//		}
//		tx.commit();
		
	}
}
