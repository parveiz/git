package com.techsol.claims.entity;
// default package

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LabResultId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class LabResultId implements java.io.Serializable {

	// Fields

	private String provclaimno;
	private String labtestcode;
	private Integer serial;

	// Constructors

	/** default constructor */
	public LabResultId() {
	}

	/** full constructor */
	public LabResultId(String provclaimno, String labtestcode, Integer serial) {
		this.provclaimno = provclaimno;
		this.labtestcode = labtestcode;
		this.serial = serial;
	}

	// Property accessors

	@Column(name = "PROVCLAIMNO", nullable = false, length = 16)
	public String getProvclaimno() {
		return this.provclaimno;
	}

	public void setProvclaimno(String provclaimno) {
		this.provclaimno = provclaimno;
	}

	@Column(name = "LABTESTCODE", nullable = false, length = 15)
	public String getLabtestcode() {
		return this.labtestcode;
	}

	public void setLabtestcode(String labtestcode) {
		this.labtestcode = labtestcode;
	}

	@Column(name = "SERIAL", nullable = false)
	public Integer getSerial() {
		return this.serial;
	}

	public void setSerial(Integer serial) {
		this.serial = serial;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LabResultId))
			return false;
		LabResultId castOther = (LabResultId) other;

		return ((this.getProvclaimno() == castOther.getProvclaimno()) || (this
				.getProvclaimno() != null && castOther.getProvclaimno() != null && this
				.getProvclaimno().equals(castOther.getProvclaimno())))
				&& ((this.getLabtestcode() == castOther.getLabtestcode()) || (this
						.getLabtestcode() != null
						&& castOther.getLabtestcode() != null && this
						.getLabtestcode().equals(castOther.getLabtestcode())))
				&& ((this.getSerial() == castOther.getSerial()) || (this
						.getSerial() != null && castOther.getSerial() != null && this
						.getSerial().equals(castOther.getSerial())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProvclaimno() == null ? 0 : this.getProvclaimno()
						.hashCode());
		result = 37
				* result
				+ (getLabtestcode() == null ? 0 : this.getLabtestcode()
						.hashCode());
		result = 37 * result
				+ (getSerial() == null ? 0 : this.getSerial().hashCode());
		return result;
	}

}