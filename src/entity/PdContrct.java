package entity;
// Generated 2017-7-7 16:21:01 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PdContrct generated by hbm2java
 */
@Entity
@Table(name = "pd_contrct")
public class PdContrct implements java.io.Serializable {

	private Integer id;
	private String contractNo;
	private double multiplier;
	private String timeSet;
	private String chinaName;
	private String lastTrdeDay;
	private double fees;
	private double ratio;
	private String time1;
	private String time2;
	private short trde;
	private short time1Sta;
	private short time2Sta;
	private short exchange;
	private short del;
	private int marketId;
	private int safeTime;

	public PdContrct() {
	}

	public PdContrct(String contractNo, double multiplier, String timeSet, String chinaName, String lastTrdeDay,
			double fees, double ratio, String time1, String time2, short trde, short time1Sta, short time2Sta,
			short exchange, short del, int marketId, int safeTime) {
		this.contractNo = contractNo;
		this.multiplier = multiplier;
		this.timeSet = timeSet;
		this.chinaName = chinaName;
		this.lastTrdeDay = lastTrdeDay;
		this.fees = fees;
		this.ratio = ratio;
		this.time1 = time1;
		this.time2 = time2;
		this.trde = trde;
		this.time1Sta = time1Sta;
		this.time2Sta = time2Sta;
		this.exchange = exchange;
		this.del = del;
		this.marketId = marketId;
		this.safeTime = safeTime;
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

	@Column(name = "contract_no", nullable = false, length = 20)
	public String getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	@Column(name = "multiplier", nullable = false, precision = 22, scale = 0)
	public double getMultiplier() {
		return this.multiplier;
	}

	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}

	@Column(name = "time_set", nullable = false, length = 300)
	public String getTimeSet() {
		return this.timeSet;
	}

	public void setTimeSet(String timeSet) {
		this.timeSet = timeSet;
	}

	@Column(name = "china_name", nullable = false, length = 20)
	public String getChinaName() {
		return this.chinaName;
	}

	public void setChinaName(String chinaName) {
		this.chinaName = chinaName;
	}

	@Column(name = "last_trde_day", nullable = false, length = 30)
	public String getLastTrdeDay() {
		return this.lastTrdeDay;
	}

	public void setLastTrdeDay(String lastTrdeDay) {
		this.lastTrdeDay = lastTrdeDay;
	}

	@Column(name = "fees", nullable = false, precision = 22, scale = 0)
	public double getFees() {
		return this.fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Column(name = "ratio", nullable = false, precision = 22, scale = 0)
	public double getRatio() {
		return this.ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	@Column(name = "time1", nullable = false, length = 50)
	public String getTime1() {
		return this.time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	@Column(name = "time2", nullable = false, length = 50)
	public String getTime2() {
		return this.time2;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

	@Column(name = "trde", nullable = false)
	public short getTrde() {
		return this.trde;
	}

	public void setTrde(short trde) {
		this.trde = trde;
	}

	@Column(name = "time1_sta", nullable = false)
	public short getTime1Sta() {
		return this.time1Sta;
	}

	public void setTime1Sta(short time1Sta) {
		this.time1Sta = time1Sta;
	}

	@Column(name = "time2_sta", nullable = false)
	public short getTime2Sta() {
		return this.time2Sta;
	}

	public void setTime2Sta(short time2Sta) {
		this.time2Sta = time2Sta;
	}

	@Column(name = "exchange", nullable = false)
	public short getExchange() {
		return this.exchange;
	}

	public void setExchange(short exchange) {
		this.exchange = exchange;
	}

	@Column(name = "del", nullable = false)
	public short getDel() {
		return this.del;
	}

	public void setDel(short del) {
		this.del = del;
	}

	@Column(name = "market_id", nullable = false)
	public int getMarketId() {
		return this.marketId;
	}

	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}

	@Column(name = "safe_time", nullable = false)
	public int getSafeTime() {
		return this.safeTime;
	}

	public void setSafeTime(int safeTime) {
		this.safeTime = safeTime;
	}

	@Override
	public String toString() {
		return "PdContrct [id=" + id + ", contractNo=" + contractNo + ", multiplier=" + multiplier + ", timeSet="
				+ timeSet + ", chinaName=" + chinaName + ", lastTrdeDay=" + lastTrdeDay + ", fees=" + fees + ", ratio="
				+ ratio + ", time1=" + time1 + ", time2=" + time2 + ", trde=" + trde + ", time1Sta=" + time1Sta
				+ ", time2Sta=" + time2Sta + ", exchange=" + exchange + ", del=" + del + ", marketId=" + marketId
				+ ", safeTime=" + safeTime + "]";
	}

}
