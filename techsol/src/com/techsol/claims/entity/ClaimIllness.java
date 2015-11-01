package com.techsol.claims.entity;
// default package

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ClaimIllness entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "claim_illness", catalog = "techsol")
public class ClaimIllness implements java.io.Serializable {

	// Fields

	private ClaimIllnessId id;

	// Constructors

	/** default constructor */
	public ClaimIllness() {
	}

	/** full constructor */
	public ClaimIllness(ClaimIllnessId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "provclaimno", column = @Column(name = "provclaimno", nullable = false, length = 16)),
			@AttributeOverride(name = "illnesstype", column = @Column(name = "illnesstype", nullable = false, length = 30)) })
	public ClaimIllnessId getId() {
		return this.id;
	}

	public void setId(ClaimIllnessId id) {
		this.id = id;
	}

}