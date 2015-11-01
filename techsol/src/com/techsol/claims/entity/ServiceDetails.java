package com.techsol.claims.entity;
// default package

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ServiceDetails entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "service_details", catalog = "techsol")
public class ServiceDetails implements java.io.Serializable {

	// Fields

	private ServiceDetailsId id;

	// Constructors

	/** default constructor */
	public ServiceDetails() {
	}

	/** full constructor */
	public ServiceDetails(ServiceDetailsId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "invoiceno", column = @Column(name = "INVOICENO", nullable = false, length = 20)),
			@AttributeOverride(name = "servicecode", column = @Column(name = "SERVICECODE", nullable = false, length = 20)),
			@AttributeOverride(name = "servicedate", column = @Column(name = "SERVICEDATE", length = 10)),
			@AttributeOverride(name = "servicedesc", column = @Column(name = "SERVICEDESC", length = 80)),
			@AttributeOverride(name = "unitserviceprice", column = @Column(name = "UNITSERVICEPRICE", precision = 14)),
			@AttributeOverride(name = "unitservicetype", column = @Column(name = "UNITSERVICETYPE", length = 40)),
			@AttributeOverride(name = "qty", column = @Column(name = "QTY")),
			@AttributeOverride(name = "toothno", column = @Column(name = "TOOTHNO", length = 10)),
			@AttributeOverride(name = "totservicegrsamt", column = @Column(name = "TOTSERVICEGRSAMT", precision = 14)),
			@AttributeOverride(name = "totservicedisc", column = @Column(name = "TOTSERVICEDISC", precision = 14)),
			@AttributeOverride(name = "totservicepatshare", column = @Column(name = "TOTSERVICEPATSHARE", precision = 14)),
			@AttributeOverride(name = "totservicenetamt", column = @Column(name = "TOTSERVICENETAMT", precision = 14)) })
	public ServiceDetailsId getId() {
		return this.id;
	}

	public void setId(ServiceDetailsId id) {
		this.id = id;
	}

}