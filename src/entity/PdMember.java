package entity;
// Generated 2017-7-7 16:21:01 by Hibernate Tools 5.2.3.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PdMember generated by hbm2java
 */
@Entity
@Table(name = "pd_member")
public class PdMember implements java.io.Serializable {

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
	private short allow1;
	private short allow2;
	private short allow3;
	private short allow4;
	private int multiplier1;
	private int multiplier2;
	private int multiplier3;
	private int multiplier4;
	private double winpoint1;
	private double winpoint2;
	private double winpoint3;
	private double winpoint4;
	private double lostpoint1;
	private double lostpoint2;
	private double lostpoint3;
	private double lostpoint4;
	private Date time1;
	private Date time2;
	private Date time3;
	private Date time4;
	private int danId;
	private String danName;
	private int danPath;
	private int danValue;

	public PdMember() {
	}

	public PdMember(String userName, String userPass, String userNick, double closeLine, BigDecimal userFunds,
			BigDecimal sysFunds, short loginSta, int trdeSta, int adminId, short userType, String idCard,
			String bankCard, String bankName, String mob, String weixin, String email, String safePass, Date creatTime,
			String loginIp, short allow1, short allow2, short allow3, short allow4, int multiplier1, int multiplier2,
			int multiplier3, int multiplier4, double winpoint1, double winpoint2, double winpoint3, double winpoint4,
			double lostpoint1, double lostpoint2, double lostpoint3, double lostpoint4, Date time1, Date time2,
			Date time3, Date time4, int danId, String danName, int danPath, int danValue) {
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
		this.allow1 = allow1;
		this.allow2 = allow2;
		this.allow3 = allow3;
		this.allow4 = allow4;
		this.multiplier1 = multiplier1;
		this.multiplier2 = multiplier2;
		this.multiplier3 = multiplier3;
		this.multiplier4 = multiplier4;
		this.winpoint1 = winpoint1;
		this.winpoint2 = winpoint2;
		this.winpoint3 = winpoint3;
		this.winpoint4 = winpoint4;
		this.lostpoint1 = lostpoint1;
		this.lostpoint2 = lostpoint2;
		this.lostpoint3 = lostpoint3;
		this.lostpoint4 = lostpoint4;
		this.time1 = time1;
		this.time2 = time2;
		this.time3 = time3;
		this.time4 = time4;
		this.danId = danId;
		this.danName = danName;
		this.danPath = danPath;
		this.danValue = danValue;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "user_name", nullable = false, length = 20)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "user_pass", nullable = false, length = 32)
	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	@Column(name = "user_nick", nullable = false, length = 20)
	public String getUserNick() {
		return this.userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	@Column(name = "close_line", nullable = false, precision = 22, scale = 0)
	public double getCloseLine() {
		return this.closeLine;
	}

	public void setCloseLine(double closeLine) {
		this.closeLine = closeLine;
	}

	@Column(name = "user_funds", nullable = false, precision = 15)
	public BigDecimal getUserFunds() {
		return this.userFunds;
	}

	public void setUserFunds(BigDecimal userFunds) {
		this.userFunds = userFunds;
	}

	@Column(name = "sys_funds", nullable = false, precision = 15)
	public BigDecimal getSysFunds() {
		return this.sysFunds;
	}

	public void setSysFunds(BigDecimal sysFunds) {
		this.sysFunds = sysFunds;
	}

	@Column(name = "login_sta", nullable = false)
	public short getLoginSta() {
		return this.loginSta;
	}

	public void setLoginSta(short loginSta) {
		this.loginSta = loginSta;
	}

	@Column(name = "trde_sta", nullable = false)
	public int getTrdeSta() {
		return this.trdeSta;
	}

	public void setTrdeSta(int trdeSta) {
		this.trdeSta = trdeSta;
	}

	@Column(name = "admin_id", nullable = false)
	public int getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	@Column(name = "user_type", nullable = false)
	public short getUserType() {
		return this.userType;
	}

	public void setUserType(short userType) {
		this.userType = userType;
	}

	@Column(name = "id_card", nullable = false, length = 20)
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Column(name = "bank_card", nullable = false, length = 20)
	public String getBankCard() {
		return this.bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	@Column(name = "bank_name", nullable = false, length = 50)
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "mob", nullable = false, length = 11)
	public String getMob() {
		return this.mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Column(name = "weixin", nullable = false, length = 20)
	public String getWeixin() {
		return this.weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	@Column(name = "email", nullable = false, length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "safe_pass", nullable = false, length = 11)
	public String getSafePass() {
		return this.safePass;
	}

	public void setSafePass(String safePass) {
		this.safePass = safePass;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creat_time", nullable = false, length = 19)
	public Date getCreatTime() {
		return this.creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	@Column(name = "login_ip", nullable = false, length = 50)
	public String getLoginIp() {
		return this.loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	@Column(name = "allow1", nullable = false)
	public short getAllow1() {
		return this.allow1;
	}

	public void setAllow1(short allow1) {
		this.allow1 = allow1;
	}

	@Column(name = "allow2", nullable = false)
	public short getAllow2() {
		return this.allow2;
	}

	public void setAllow2(short allow2) {
		this.allow2 = allow2;
	}

	@Column(name = "allow3", nullable = false)
	public short getAllow3() {
		return this.allow3;
	}

	public void setAllow3(short allow3) {
		this.allow3 = allow3;
	}

	@Column(name = "allow4", nullable = false)
	public short getAllow4() {
		return this.allow4;
	}

	public void setAllow4(short allow4) {
		this.allow4 = allow4;
	}

	@Column(name = "multiplier1", nullable = false)
	public int getMultiplier1() {
		return this.multiplier1;
	}

	public void setMultiplier1(int multiplier1) {
		this.multiplier1 = multiplier1;
	}

	@Column(name = "multiplier2", nullable = false)
	public int getMultiplier2() {
		return this.multiplier2;
	}

	public void setMultiplier2(int multiplier2) {
		this.multiplier2 = multiplier2;
	}

	@Column(name = "multiplier3", nullable = false)
	public int getMultiplier3() {
		return this.multiplier3;
	}

	public void setMultiplier3(int multiplier3) {
		this.multiplier3 = multiplier3;
	}

	@Column(name = "multiplier4", nullable = false)
	public int getMultiplier4() {
		return this.multiplier4;
	}

	public void setMultiplier4(int multiplier4) {
		this.multiplier4 = multiplier4;
	}

	@Column(name = "winpoint1", nullable = false, precision = 11, scale = 3)
	public double getWinpoint1() {
		return this.winpoint1;
	}

	public void setWinpoint1(double winpoint1) {
		this.winpoint1 = winpoint1;
	}

	@Column(name = "winpoint2", nullable = false, precision = 11, scale = 3)
	public double getWinpoint2() {
		return this.winpoint2;
	}

	public void setWinpoint2(double winpoint2) {
		this.winpoint2 = winpoint2;
	}

	@Column(name = "winpoint3", nullable = false, precision = 11, scale = 3)
	public double getWinpoint3() {
		return this.winpoint3;
	}

	public void setWinpoint3(double winpoint3) {
		this.winpoint3 = winpoint3;
	}

	@Column(name = "winpoint4", nullable = false, precision = 11, scale = 3)
	public double getWinpoint4() {
		return this.winpoint4;
	}

	public void setWinpoint4(double winpoint4) {
		this.winpoint4 = winpoint4;
	}

	@Column(name = "lostpoint1", nullable = false, precision = 11, scale = 3)
	public double getLostpoint1() {
		return this.lostpoint1;
	}

	public void setLostpoint1(double lostpoint1) {
		this.lostpoint1 = lostpoint1;
	}

	@Column(name = "lostpoint2", nullable = false, precision = 11, scale = 3)
	public double getLostpoint2() {
		return this.lostpoint2;
	}

	public void setLostpoint2(double lostpoint2) {
		this.lostpoint2 = lostpoint2;
	}

	@Column(name = "lostpoint3", nullable = false, precision = 11, scale = 3)
	public double getLostpoint3() {
		return this.lostpoint3;
	}

	public void setLostpoint3(double lostpoint3) {
		this.lostpoint3 = lostpoint3;
	}

	@Column(name = "lostpoint4", nullable = false, precision = 11, scale = 3)
	public double getLostpoint4() {
		return this.lostpoint4;
	}

	public void setLostpoint4(double lostpoint4) {
		this.lostpoint4 = lostpoint4;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "time1", nullable = false, length = 8)
	public Date getTime1() {
		return this.time1;
	}

	public void setTime1(Date time1) {
		this.time1 = time1;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "time2", nullable = false, length = 8)
	public Date getTime2() {
		return this.time2;
	}

	public void setTime2(Date time2) {
		this.time2 = time2;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "time3", nullable = false, length = 8)
	public Date getTime3() {
		return this.time3;
	}

	public void setTime3(Date time3) {
		this.time3 = time3;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "time4", nullable = false, length = 8)
	public Date getTime4() {
		return this.time4;
	}

	public void setTime4(Date time4) {
		this.time4 = time4;
	}

	@Column(name = "dan_id", nullable = false)
	public int getDanId() {
		return this.danId;
	}

	public void setDanId(int danId) {
		this.danId = danId;
	}

	@Column(name = "dan_name", nullable = false, length = 32)
	public String getDanName() {
		return this.danName;
	}

	public void setDanName(String danName) {
		this.danName = danName;
	}

	@Column(name = "dan_path", nullable = false)
	public int getDanPath() {
		return this.danPath;
	}

	public void setDanPath(int danPath) {
		this.danPath = danPath;
	}

	@Column(name = "dan_value", nullable = false)
	public int getDanValue() {
		return this.danValue;
	}

	public void setDanValue(int danValue) {
		this.danValue = danValue;
	}

	@Override
	public String toString() {
		return "PdMember [id=" + id + ", userName=" + userName + ", userPass=" + userPass + ", userNick=" + userNick
				+ ", closeLine=" + closeLine + ", userFunds=" + userFunds + ", sysFunds=" + sysFunds + ", loginSta="
				+ loginSta + ", trdeSta=" + trdeSta + ", adminId=" + adminId + ", userType=" + userType + ", idCard="
				+ idCard + ", bankCard=" + bankCard + ", bankName=" + bankName + ", mob=" + mob + ", weixin=" + weixin
				+ ", email=" + email + ", safePass=" + safePass + ", creatTime=" + creatTime + ", loginIp=" + loginIp
				+ ", allow1=" + allow1 + ", allow2=" + allow2 + ", allow3=" + allow3 + ", allow4=" + allow4
				+ ", multiplier1=" + multiplier1 + ", multiplier2=" + multiplier2 + ", multiplier3=" + multiplier3
				+ ", multiplier4=" + multiplier4 + ", winpoint1=" + winpoint1 + ", winpoint2=" + winpoint2
				+ ", winpoint3=" + winpoint3 + ", winpoint4=" + winpoint4 + ", lostpoint1=" + lostpoint1
				+ ", lostpoint2=" + lostpoint2 + ", lostpoint3=" + lostpoint3 + ", lostpoint4=" + lostpoint4
				+ ", time1=" + time1 + ", time2=" + time2 + ", time3=" + time3 + ", time4=" + time4 + ", danId=" + danId
				+ ", danName=" + danName + ", danPath=" + danPath + ", danValue=" + danValue + "]";
	}

}
