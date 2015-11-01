package com.techsol.claims.entity;
// default package

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ClaimDiagnosisId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ClaimDiagnosisId implements java.io.Serializable {

	// Fields

	private String provclaimno;
	private String diagnosiscode;

	// Constructors

	/** default constructor */
	public ClaimDiagnosisId() {
	}

	/** full constructor */
	public ClaimDiagnosisId(String provclaimno, String diagnosiscode) {
		this.provclaimno = provclaimno;
		this.diagnosiscode = diagnosiscode;
	}

	// Property accessors

	@Column(name = "provclaimno", nullable = false, length = 16)
	public String getProvclaimno() {
		return this.provclaimno;
	}

	public void setProvclaimno(String provclaimno) {
		this.provclaimno = provclaimno;
	}

	@Column(name = "diagnosiscode", nullable = false, length = 30)
	public String getDiagnosiscode() {
		return this.diagnosiscode;
	}

	public void setDiagnosiscode(String diagnosiscode) {
		this.diagnosiscode = diagnosiscode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ClaimDiagnosisId))
			return false;
		ClaimDiagnosisId castOther = (ClaimDiagnosisId) other;

		return ((this.getProvclaimno() == castOther.getProvclaimno()) || (this
				.getProvclaimno() != null && castOther.getProvclaimno() != null && this
				.getProvclaimno().equals(castOther.getProvclaimno())))
				&& ((this.getDiagnosiscode() == castOther.getDiagnosiscode()) || (this
						.getDiagnosiscode() != null
						&& castOther.getDiagnosiscode() != null && this
						.getDiagnosiscode()
						.equals(castOther.getDiagnosiscode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProvclaimno() == null ? 0 : this.getProvclaimno()
						.hashCode());
		result = 37
				* result
				+ (getDiagnosiscode() == null ? 0 : this.getDiagnosiscode()
						.hashCode());
		return result;
	}

}