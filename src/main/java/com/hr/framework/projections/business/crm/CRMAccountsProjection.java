package com.hr.framework.projections.business.crm;

import org.springframework.data.rest.core.config.Projection;

import com.hr.framework.po.business.crm.Accounts;

@Projection(name = "crmAccountsProjection" , types = {Accounts.class})
public interface CRMAccountsProjection {
	
	
	Long getId();
	
	String getFullName();
	
	boolean isDeleted();
	
	
	String getDescription();
	
	
	String getAnnualRevenue();
	
	
	String getPhoneFax();
	
	
	String getPhoneOffice();
	
	
	String getPhoneAlternate();
	
	
	String getLogin();

}
