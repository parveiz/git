package com.techsol.claims.entity;
// default package

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Reglensspec entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "reglensspec", catalog = "techsol")
public class Reglensspec implements java.io.Serializable {

	// Fields

	private ReglensspecId id;

	// Constructors

	/** default constructor */
	public Reglensspec() {
	}

	/** full constructor */
	public Reglensspec(ReglensspecId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "servicetype", column = @Column(name = "SERVICETYPE", nullable = false, length = 20)),
			@AttributeOverride(name = "invoiceno", column = @Column(name = "INVOICENO", nullable = false, length = 20)),
			@AttributeOverride(name = "reglensesspeccode", column = @Column(name = "REGLENSESSPECCODE", nullable = false, length = 35)) })
	public ReglensspecId getId() {
		return this.id;
	}

	public void setId(ReglensspecId id) {
		this.id = id;
	}

}