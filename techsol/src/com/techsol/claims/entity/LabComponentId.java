package com.techsol.claims.entity;
// default package

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LabComponentId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class LabComponentId implements java.io.Serializable {

	// Fields

	private String labtestcode;
	private String provclaimno;
	private Integer serial;
	private String labcompcode;

	// Constructors

	/** default constructor */
	public LabComponentId() {
	}

	/** full constructor */
	public LabComponentId(String labtestcode, String provclaimno,
			Integer serial, String labcompcode) {
		this.labtestcode = labtestcode;
		this.provclaimno = provclaimno;
		this.serial = serial;
		this.labcompcode = labcompcode;
	}

	// Property accessors

	@Column(name = "LABTESTCODE", nullable = false, length = 15)
	public String getLabtestcode() {
		return this.labtestcode;
	}

	public void setLabtestcode(String labtestcode) {
		this.labtestcode = labtestcode;
	}

	@Column(name = "PROVCLAIMNO", nullable = false, length = 16)
	public String getProvclaimno() {
		return this.provclaimno;
	}

	public void setProvclaimno(String provclaimno) {
		this.provclaimno = provclaimno;
	}

	@Column(name = "SERIAL", nullable = false)
	public Integer getSerial() {
		return this.serial;
	}

	public void setSerial(Integer serial) {
		this.serial = serial;
	}

	@Column(name = "LABCOMPCODE", nullable = false, length = 15)
	public String getLabcompcode() {
		return this.labcompcode;
	}

	public void setLabcompcode(String labcompcode) {
		this.labcompcode = labcompcode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LabComponentId))
			return false;
		LabComponentId castOther = (LabComponentId) other;

		return ((this.getLabtestcode() == castOther.getLabtestcode()) || (this
				.getLabtestcode() != null && castOther.getLabtestcode() != null && this
				.getLabtestcode().equals(castOther.getLabtestcode())))
				&& ((this.getProvclaimno() == castOther.getProvclaimno()) || (this
						.getProvclaimno() != null
						&& castOther.getProvclaimno() != null && this
						.getProvclaimno().equals(castOther.getProvclaimno())))
				&& ((this.getSerial() == castOther.getSerial()) || (this
						.getSerial() != null && castOther.getSerial() != null && this
						.getSerial().equals(castOther.getSerial())))
				&& ((this.getLabcompcode() == castOther.getLabcompcode()) || (this
						.getLabcompcode() != null
						&& castOther.getLabcompcode() != null && this
						.getLabcompcode().equals(castOther.getLabcompcode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getLabtestcode() == null ? 0 : this.getLabtestcode()
						.hashCode());
		result = 37
				* result
				+ (getProvclaimno() == null ? 0 : this.getProvclaimno()
						.hashCode());
		result = 37 * result
				+ (getSerial() == null ? 0 : this.getSerial().hashCode());
		result = 37
				* result
				+ (getLabcompcode() == null ? 0 : this.getLabcompcode()
						.hashCode());
		return result;
	}

}