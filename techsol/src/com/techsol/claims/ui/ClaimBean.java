package com.techsol.claims.ui;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import com.techsol.claims.entity.Geninfo;
import com.techsol.claims.entity.GeninfoFacade;
import com.techsol.claims.entity.Invoices;
import com.techsol.claims.entity.InvoicesFacade;

@ManagedBean
@SessionScoped
public class ClaimBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty("#{geninfo}")
	private Geninfo geninfo;
	@Inject
	private GeninfoFacade geninfoFacade;

	@ManagedProperty("#{invoices}")
	private Invoices invoices;
	@Inject
	private InvoicesFacade invoicesFacade;


	public String Save() {
		String retValue = "claim_save_successful";
		try {
			geninfoFacade.save(geninfo);
		} catch (Exception e) {
			e.printStackTrace();
			retValue = "claim_save_failure";
		}
		return retValue;
	}

	public void addInvoiceToClaim(ActionEvent evt) {
		try {
			System.out.println("hi---");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Invoices getInvoices() {
		return invoices;
	}
	public void setInvoices(Invoices invoices) {
		this.invoices = invoices;
	}
	public InvoicesFacade getInvoicesFacade() {
		return invoicesFacade;
	}
	public void setInvoicesFacade(InvoicesFacade invoicesFacade) {
		this.invoicesFacade = invoicesFacade;
	}
	
	public Geninfo getGeninfo() {
		return geninfo;
	}

	public void setGeninfo(Geninfo geninfo) {
		this.geninfo = geninfo;
	}

	public GeninfoFacade getGeninfoFacade() {
		return geninfoFacade;
	}

	public void setGeninfoFacade(GeninfoFacade geninfoFacade) {
		this.geninfoFacade = geninfoFacade;
	}

}
