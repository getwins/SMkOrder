package entity;
// Generated 2017-6-29 16:21:02 by Hibernate Tools 5.2.3.Final

import java.util.Date;

/**
 * PdEntrust generated by hbm2java
 */
public class PdEntrust implements java.io.Serializable {

	private Integer id;
	private int memberId;
	private int contrctId;
	private int num;
	private int clienhNum;
	private double price;
	private short path;
	private short openClose;
	private short sta;
	private Date creatTime;
	private int gitId;
	private Double openprice;
	private int tradetype;
	private int ordertype;

	public PdEntrust() {
	}

	public PdEntrust(int memberId, int contrctId, int num, int clienhNum, double price, short path, short openClose,
			short sta, Date creatTime, int gitId, int tradetype, int ordertype) {
		this.memberId = memberId;
		this.contrctId = contrctId;
		this.num = num;
		this.clienhNum = clienhNum;
		this.price = price;
		this.path = path;
		this.openClose = openClose;
		this.sta = sta;
		this.creatTime = creatTime;
		this.gitId = gitId;
		this.tradetype = tradetype;
		this.ordertype = ordertype;
	}

	public PdEntrust(int memberId, int contrctId, int num, int clienhNum, double price, short path, short openClose,
			short sta, Date creatTime, int gitId, Double openprice, int tradetype, int ordertype) {
		this.memberId = memberId;
		this.contrctId = contrctId;
		this.num = num;
		this.clienhNum = clienhNum;
		this.price = price;
		this.path = path;
		this.openClose = openClose;
		this.sta = sta;
		this.creatTime = creatTime;
		this.gitId = gitId;
		this.openprice = openprice;
		this.tradetype = tradetype;
		this.ordertype = ordertype;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getContrctId() {
		return this.contrctId;
	}

	public void setContrctId(int contrctId) {
		this.contrctId = contrctId;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getClienhNum() {
		return this.clienhNum;
	}

	public void setClienhNum(int clienhNum) {
		this.clienhNum = clienhNum;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public short getPath() {
		return this.path;
	}

	public void setPath(short path) {
		this.path = path;
	}

	public short getOpenClose() {
		return this.openClose;
	}

	public void setOpenClose(short openClose) {
		this.openClose = openClose;
	}

	public short getSta() {
		return this.sta;
	}

	public void setSta(short sta) {
		this.sta = sta;
	}

	public Date getCreatTime() {
		return this.creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public int getGitId() {
		return this.gitId;
	}

	public void setGitId(int gitId) {
		this.gitId = gitId;
	}

	public Double getOpenprice() {
		return this.openprice;
	}

	public void setOpenprice(Double openprice) {
		this.openprice = openprice;
	}

	public int getTradetype() {
		return this.tradetype;
	}

	public void setTradetype(int tradetype) {
		this.tradetype = tradetype;
	}

	public int getOrdertype() {
		return this.ordertype;
	}

	public void setOrdertype(int ordertype) {
		this.ordertype = ordertype;
	}

}