package com.techsol.claims.entity;
// default package

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ServiceOpticalId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ServiceOpticalId implements java.io.Serializable {

	// Fields

	private String invoiceno;
	private String servicetype;

	// Constructors

	/** default constructor */
	public ServiceOpticalId() {
	}

	/** full constructor */
	public ServiceOpticalId(String invoiceno, String servicetype) {
		this.invoiceno = invoiceno;
		this.servicetype = servicetype;
	}

	// Property accessors

	@Column(name = "INVOICENO", nullable = false, length = 20)
	public String getInvoiceno() {
		return this.invoiceno;
	}

	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}

	@Column(name = "SERVICETYPE", nullable = false, length = 20)
	public String getServicetype() {
		return this.servicetype;
	}

	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ServiceOpticalId))
			return false;
		ServiceOpticalId castOther = (ServiceOpticalId) other;

		return ((this.getInvoiceno() == castOther.getInvoiceno()) || (this
				.getInvoiceno() != null && castOther.getInvoiceno() != null && this
				.getInvoiceno().equals(castOther.getInvoiceno())))
				&& ((this.getServicetype() == castOther.getServicetype()) || (this
						.getServicetype() != null
						&& castOther.getServicetype() != null && this
						.getServicetype().equals(castOther.getServicetype())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getInvoiceno() == null ? 0 : this.getInvoiceno().hashCode());
		result = 37
				* result
				+ (getServicetype() == null ? 0 : this.getServicetype()
						.hashCode());
		return result;
	}

}