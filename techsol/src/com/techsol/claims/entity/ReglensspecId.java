package com.techsol.claims.entity;
// default package

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ReglensspecId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ReglensspecId implements java.io.Serializable {

	// Fields

	private String servicetype;
	private String invoiceno;
	private String reglensesspeccode;

	// Constructors

	/** default constructor */
	public ReglensspecId() {
	}

	/** full constructor */
	public ReglensspecId(String servicetype, String invoiceno,
			String reglensesspeccode) {
		this.servicetype = servicetype;
		this.invoiceno = invoiceno;
		this.reglensesspeccode = reglensesspeccode;
	}

	// Property accessors

	@Column(name = "SERVICETYPE", nullable = false, length = 20)
	public String getServicetype() {
		return this.servicetype;
	}

	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
	}

	@Column(name = "INVOICENO", nullable = false, length = 20)
	public String getInvoiceno() {
		return this.invoiceno;
	}

	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}

	@Column(name = "REGLENSESSPECCODE", nullable = false, length = 35)
	public String getReglensesspeccode() {
		return this.reglensesspeccode;
	}

	public void setReglensesspeccode(String reglensesspeccode) {
		this.reglensesspeccode = reglensesspeccode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReglensspecId))
			return false;
		ReglensspecId castOther = (ReglensspecId) other;

		return ((this.getServicetype() == castOther.getServicetype()) || (this
				.getServicetype() != null && castOther.getServicetype() != null && this
				.getServicetype().equals(castOther.getServicetype())))
				&& ((this.getInvoiceno() == castOther.getInvoiceno()) || (this
						.getInvoiceno() != null
						&& castOther.getInvoiceno() != null && this
						.getInvoiceno().equals(castOther.getInvoiceno())))
				&& ((this.getReglensesspeccode() == castOther
						.getReglensesspeccode()) || (this
						.getReglensesspeccode() != null
						&& castOther.getReglensesspeccode() != null && this
						.getReglensesspeccode().equals(
								castOther.getReglensesspeccode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getServicetype() == null ? 0 : this.getServicetype()
						.hashCode());
		result = 37 * result
				+ (getInvoiceno() == null ? 0 : this.getInvoiceno().hashCode());
		result = 37
				* result
				+ (getReglensesspeccode() == null ? 0 : this
						.getReglensesspeccode().hashCode());
		return result;
	}

}