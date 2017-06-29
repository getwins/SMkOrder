package entity;
// Generated 2017-6-29 16:21:02 by Hibernate Tools 5.2.3.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * PdMemberCopy generated by hbm2java
 */
public class PdMemberCopy implements java.io.Serializable {

	private Integer id;
	private String userName;
	private String userPass;
	private String userNick;
	private double closeLine;
	private BigDecimal userFunds;
	private BigDecimal sysFunds;
	private short loginSta;
	private int trdeSta;
	private int adminId;
	private short userType;
	private String idCard;
	private String bankCard;
	private String bankName;
	private String mob;
	private String weixin;
	private String email;
	private String safePass;
	private Date creatTime;
	private String loginIp;
	private short allowdax;
	private int daxMul;
	private short allowhsi;
	private int hsiMul;
	private short allowsgx;
	private int sgxMul;
	private int winpoint;
	private int lostpoint;

	public PdMemberCopy() {
	}

	public PdMemberCopy(String userName, String userPass, String userNick, double closeLine, BigDecimal userFunds,
			BigDecimal sysFunds, short loginSta, int trdeSta, int adminId, short userType, String idCard,
			String bankCard, String bankName, String mob, String weixin, String email, String safePass, Date creatTime,
			String loginIp, short allowdax, int daxMul, short allowhsi, int hsiMul, short allowsgx, int sgxMul,
			int winpoint, int lostpoint) {
		this.userName = userName;
		this.userPass = userPass;
		this.userNick = userNick;
		this.closeLine = closeLine;
		this.userFunds = userFunds;
		this.sysFunds = sysFunds;
		this.loginSta = loginSta;
		this.trdeSta = trdeSta;
		this.adminId = adminId;
		this.userType = userType;
		this.idCard = idCard;
		this.bankCard = bankCard;
		this.bankName = bankName;
		this.mob = mob;
		this.weixin = weixin;
		this.email = email;
		this.safePass = safePass;
		this.creatTime = creatTime;
		this.loginIp = loginIp;
		this.allowdax = allowdax;
		this.daxMul = daxMul;
		this.allowhsi = allowhsi;
		this.hsiMul = hsiMul;
		this.allowsgx = allowsgx;
		this.sgxMul = sgxMul;
		this.winpoint = winpoint;
		this.lostpoint = lostpoint;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserNick() {
		return this.userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public double getCloseLine() {
		return this.closeLine;
	}

	public void setCloseLine(double closeLine) {
		this.closeLine = closeLine;
	}

	public BigDecimal getUserFunds() {
		return this.userFunds;
	}

	public void setUserFunds(BigDecimal userFunds) {
		this.userFunds = userFunds;
	}

	public BigDecimal getSysFunds() {
		return this.sysFunds;
	}

	public void setSysFunds(BigDecimal sysFunds) {
		this.sysFunds = sysFunds;
	}

	public short getLoginSta() {
		return this.loginSta;
	}

	public void setLoginSta(short loginSta) {
		this.loginSta = loginSta;
	}

	public int getTrdeSta() {
		return this.trdeSta;
	}

	public void setTrdeSta(int trdeSta) {
		this.trdeSta = trdeSta;
	}

	public int getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public short getUserType() {
		return this.userType;
	}

	public void setUserType(short userType) {
		this.userType = userType;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getBankCard() {
		return this.bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getMob() {
		return this.mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getWeixin() {
		return this.weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSafePass() {
		return this.safePass;
	}

	public void setSafePass(String safePass) {
		this.safePass = safePass;
	}

	public Date getCreatTime() {
		return this.creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public String getLoginIp() {
		return this.loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public short getAllowdax() {
		return this.allowdax;
	}

	public void setAllowdax(short allowdax) {
		this.allowdax = allowdax;
	}

	public int getDaxMul() {
		return this.daxMul;
	}

	public void setDaxMul(int daxMul) {
		this.daxMul = daxMul;
	}

	public short getAllowhsi() {
		return this.allowhsi;
	}

	public void setAllowhsi(short allowhsi) {
		this.allowhsi = allowhsi;
	}

	public int getHsiMul() {
		return this.hsiMul;
	}

	public void setHsiMul(int hsiMul) {
		this.hsiMul = hsiMul;
	}

	public short getAllowsgx() {
		return this.allowsgx;
	}

	public void setAllowsgx(short allowsgx) {
		this.allowsgx = allowsgx;
	}

	public int getSgxMul() {
		return this.sgxMul;
	}

	public void setSgxMul(int sgxMul) {
		this.sgxMul = sgxMul;
	}

	public int getWinpoint() {
		return this.winpoint;
	}

	public void setWinpoint(int winpoint) {
		this.winpoint = winpoint;
	}

	public int getLostpoint() {
		return this.lostpoint;
	}

	public void setLostpoint(int lostpoint) {
		this.lostpoint = lostpoint;
	}

}
