package entity;
// Generated 2017-7-2 14:09:52 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * PdSetting generated by hbm2java
 */
@Entity
@Table(name = "pd_setting", catalog = "stockhh", uniqueConstraints = @UniqueConstraint(columnNames = "zkl_variable"))
public class PdSetting implements java.io.Serializable {

	private Integer zstId;
	private boolean zklType;
	private String zklTitle;
	private String zklVariable;
	private String zklValued;

	public PdSetting() {
	}

	public PdSetting(boolean zklType, String zklVariable, String zklValued) {
		this.zklType = zklType;
		this.zklVariable = zklVariable;
		this.zklValued = zklValued;
	}

	public PdSetting(boolean zklType, String zklTitle, String zklVariable, String zklValued) {
		this.zklType = zklType;
		this.zklTitle = zklTitle;
		this.zklVariable = zklVariable;
		this.zklValued = zklValued;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "zst_id", unique = true, nullable = false)
	public Integer getZstId() {
		return this.zstId;
	}

	public void setZstId(Integer zstId) {
		this.zstId = zstId;
	}

	@Column(name = "zkl_type", nullable = false)
	public boolean isZklType() {
		return this.zklType;
	}

	public void setZklType(boolean zklType) {
		this.zklType = zklType;
	}

	@Column(name = "zkl_title", length = 100)
	public String getZklTitle() {
		return this.zklTitle;
	}

	public void setZklTitle(String zklTitle) {
		this.zklTitle = zklTitle;
	}

	@Column(name = "zkl_variable", unique = true, nullable = false, length = 100)
	public String getZklVariable() {
		return this.zklVariable;
	}

	public void setZklVariable(String zklVariable) {
		this.zklVariable = zklVariable;
	}

	@Column(name = "zkl_valued", nullable = false, length = 65535)
	public String getZklValued() {
		return this.zklValued;
	}

	public void setZklValued(String zklValued) {
		this.zklValued = zklValued;
	}

}
