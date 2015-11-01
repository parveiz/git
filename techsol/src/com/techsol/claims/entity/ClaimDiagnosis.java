package com.techsol.claims.entity;
// default package

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ClaimDiagnosis entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "claim_diagnosis", catalog = "techsol")
public class ClaimDiagnosis implements java.io.Serializable {

	// Fields

	private ClaimDiagnosisId id;
	private String diagnosisdesc;

	// Constructors

	/** default constructor */
	public ClaimDiagnosis() {
	}

	/** minimal constructor */
	public ClaimDiagnosis(ClaimDiagnosisId id) {
		this.id = id;
	}

	/** full constructor */
	public ClaimDiagnosis(ClaimDiagnosisId id, String diagnosisdesc) {
		this.id = id;
		this.diagnosisdesc = diagnosisdesc;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "provclaimno", column = @Column(name = "provclaimno", nullable = false, length = 16)),
			@AttributeOverride(name = "diagnosiscode", column = @Column(name = "diagnosiscode", nullable = false, length = 30)) })
	public ClaimDiagnosisId getId() {
		return this.id;
	}

	public void setId(ClaimDiagnosisId id) {
		this.id = id;
	}

	@Column(name = "diagnosisdesc", length = 256)
	public String getDiagnosisdesc() {
		return this.diagnosisdesc;
	}

	public void setDiagnosisdesc(String diagnosisdesc) {
		this.diagnosisdesc = diagnosisdesc;
	}

}