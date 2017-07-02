import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

import javax.persistence.NoResultException;


import org.hibernate.Session;

import antlr.collections.List;
import entity.PdContrct;
import entity.PdGit;
import entity.PdMember;
import util.HibernateUtil;

public class SanitySystemIn {
	private PdMember member;
	private PdContrct contrct;
	private int path;
	private int openClose;
	int num;
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	private Date entrustTime;
	private double entrustPrice;
	private Date tradeTime;
	private double tradePrice;


	private PdGit git;
	private Scanner sc;
	Session session;
	
	public SanitySystemIn() {
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		session = HibernateUtil.getSession();
	}
	
	public PdMember getMember() {
		return member;
	}
	public void setMember(PdMember member) {
		this.member = member;
	}
	public PdContrct getContrct() {
		return contrct;
	}
	public void setContrct(PdContrct contrct) {
		this.contrct = contrct;
	}
	public int getPath() {
		return path;
	}
	public void setPath(int path) {
		this.path = path;
	}
	public int getOpenClose() {
		return openClose;
	}
	public void setOpenClose(int openClose) {
		this.openClose = openClose;
	}

	public double getEntrustPrice() {
		return entrustPrice;
	}
	public void setEntrustPrice(double entrustPrice) {
		this.entrustPrice = entrustPrice;
	}

	public double getTradePrice() {
		return tradePrice;
	}
	public void setTradePrice(double tradePrice) {
		this.tradePrice = tradePrice;
	}
	
	public Date getEntrustTime() {
		return entrustTime;
	}

	public void setEntrustTime(Date entrustTime) {
		this.entrustTime = entrustTime;
	}

	public Date getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}
	
	public PdGit getGit() {
		return git;
	}

	public void setGit(PdGit git) {
		this.git = git;
	}
	
	public void sanityMemberSystemIn(){
		do{
			try{
				System.out.println("请输入客户号");	
				String userName = sc.nextLine();
				String hql = "select m from PdMember m where m.userName = :name";
				member = (PdMember)session.createQuery(hql)
						.setParameter("name", userName)
						.getSingleResult();

			}
			catch(NoResultException e){
				System.out.println("该用户不存在，请再次输入");
			}

		}while(member == null);
		
	}
	
	public void sanityContractSystemIn(){
		do{
			try{
				System.out.println("请输入合约代码");
				String hql = "select c from PdContrct c where c.contractNo = :contractNo";
				String contractNo = sc.nextLine();
				contrct = (PdContrct) session.createQuery(hql)
						.setParameter("contractNo", contractNo)
						.getSingleResult();
			}
			catch(NoResultException e){
				System.out.println("该合约不存在，请再次输入");
			}
		}while(contrct == null);	
	}
	
	public void sanityPathSystemIn(){
		for(;;){
			System.out.println("请输入买卖方向，0代表买，1代表卖");
			path = sc.nextInt();
			if(path == 0 || path == 1){
				break;
			}
			System.out.println("买卖方向输入不合法，请再次输入");
		}
		
	}
	
	public void sanityOpenCloseSystemIn(){
		for(;;){
			System.out.println("请输入开平标志，0代表开，1代表平");
			openClose = sc.nextInt();
			if(openClose == 0 || openClose == 1)
				break;
			System.out.println("开平标志输入不合法，请再次输入");
		}
	}
	
	public void sanityEntrustTimeSystemIn(){
		for(;;){
			try{
				System.out.println("请输入委托创建时间，时间格式yyyy-MM-dd HH:mm:ss,默认为当前时间");
				String createTime = sc.nextLine();
				if(createTime.isEmpty())
					entrustTime = new Date();
				else{
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					entrustTime = formatter.parse(createTime);
				}
				break;
			}
			catch(ParseException e){
				System.out.println("输入的时间无效，请再次输入");
			}
		}
	}

	public void sanityTradeTimeSystemIn(){
		for(;;){
			try{
				System.out.println("请输入成交创建时间，时间格式yyyy-MM-dd HH:mm:ss,默认为当前时间");
				String createTime = sc.nextLine();
				if(createTime.isEmpty())
					tradeTime = new Date();
				else{
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					tradeTime = formatter.parse(createTime);
				}
				break;
			}
			catch(ParseException e){
				System.out.println("输入的时间无效，请再次输入");
			}
		}
	}
	
	public void fetchGit(){
		String hql = "select g from PdGit g where g.member_id = :memberId "
				+ "and g.contrct_id = :contrctId"
				+ "and g.path = :path";
		int tmpPath = path;
		if(openClose == 1){
			tmpPath = (path == 0 ? 1 : 0);
		}
		
//		TypedQuery<PdGit> query = session.createQuery(hql)
//				.setParameter("memberId", member.getId())
//				.setParameter("ccontrctId",contrct.getId())
//				.setParameter("path", tmpPath);
//		List<PdGit> gits = query.getResultList();
		
		List gits = (List) session.createQuery(hql)
				.setParameter("memberId", member.getId())
				.setParameter("ccontrctId",contrct.getId())
				.setParameter("path", tmpPath)
				.getResultList();

		
	}
	public void doSystemIn(){
		sanityMemberSystemIn();
		sanityContractSystemIn();
		sanityPathSystemIn();
		sanityOpenCloseSystemIn();
		sanityEntrustTimeSystemIn();
		entrustPrice = sc.nextDouble();
		sanityTradeTimeSystemIn();
		tradePrice = sc.nextDouble();
	}
}
