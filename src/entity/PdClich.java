package entity;
// Generated 2017-6-29 16:21:02 by Hibernate Tools 5.2.3.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * PdClich generated by hbm2java
 */
public class PdClich implements java.io.Serializable {

	private Integer id;
	private int entrustId;
	private int memberId;
	private double price;
	private int num;
	private Date creatTime;
	private int closedNum;
	private short pc;
	private double fees;
	private BigDecimal yk;
	private int multiplier;
	private double openprice;
	private int openEntrustId;

	public PdClich() {
	}

	public PdClich(int entrustId, int memberId, double price, int num, Date creatTime, int closedNum, short pc,
			double fees, BigDecimal yk, int multiplier, double openprice, int openEntrustId) {
		this.entrustId = entrustId;
		this.memberId = memberId;
		this.price = price;
		this.num = num;
		this.creatTime = creatTime;
		this.closedNum = closedNum;
		this.pc = pc;
		this.fees = fees;
		this.yk = yk;
		this.multiplier = multiplier;
		this.openprice = openprice;
		this.openEntrustId = openEntrustId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getEntrustId() {
		return this.entrustId;
	}

	public void setEntrustId(int entrustId) {
		this.entrustId = entrustId;
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Date getCreatTime() {
		return this.creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public int getClosedNum() {
		return this.closedNum;
	}

	public void setClosedNum(int closedNum) {
		this.closedNum = closedNum;
	}

	public short getPc() {
		return this.pc;
	}

	public void setPc(short pc) {
		this.pc = pc;
	}

	public double getFees() {
		return this.fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public BigDecimal getYk() {
		return this.yk;
	}

	public void setYk(BigDecimal yk) {
		this.yk = yk;
	}

	public int getMultiplier() {
		return this.multiplier;
	}

	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}

	public double getOpenprice() {
		return this.openprice;
	}

	public void setOpenprice(double openprice) {
		this.openprice = openprice;
	}

	public int getOpenEntrustId() {
		return this.openEntrustId;
	}

	public void setOpenEntrustId(int openEntrustId) {
		this.openEntrustId = openEntrustId;
	}

}