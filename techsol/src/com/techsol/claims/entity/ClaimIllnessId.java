package com.techsol.claims.entity;
// default package

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ClaimIllnessId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ClaimIllnessId implements java.io.Serializable {

	// Fields

	private String provclaimno;
	private String illnesstype;

	// Constructors

	/** default constructor */
	public ClaimIllnessId() {
	}

	/** full constructor */
	public ClaimIllnessId(String provclaimno, String illnesstype) {
		this.provclaimno = provclaimno;
		this.illnesstype = illnesstype;
	}

	// Property accessors

	@Column(name = "provclaimno", nullable = false, length = 16)
	public String getProvclaimno() {
		return this.provclaimno;
	}

	public void setProvclaimno(String provclaimno) {
		this.provclaimno = provclaimno;
	}

	@Column(name = "illnesstype", nullable = false, length = 30)
	public String getIllnesstype() {
		return this.illnesstype;
	}

	public void setIllnesstype(String illnesstype) {
		this.illnesstype = illnesstype;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ClaimIllnessId))
			return false;
		ClaimIllnessId castOther = (ClaimIllnessId) other;

		return ((this.getProvclaimno() == castOther.getProvclaimno()) || (this
				.getProvclaimno() != null && castOther.getProvclaimno() != null && this
				.getProvclaimno().equals(castOther.getProvclaimno())))
				&& ((this.getIllnesstype() == castOther.getIllnesstype()) || (this
						.getIllnesstype() != null
						&& castOther.getIllnesstype() != null && this
						.getIllnesstype().equals(castOther.getIllnesstype())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProvclaimno() == null ? 0 : this.getProvclaimno()
						.hashCode());
		result = 37
				* result
				+ (getIllnesstype() == null ? 0 : this.getIllnesstype()
						.hashCode());
		return result;
	}

}