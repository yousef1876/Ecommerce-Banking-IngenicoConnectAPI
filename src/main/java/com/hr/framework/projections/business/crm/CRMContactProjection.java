package com.hr.framework.projections.business.crm;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.hr.framework.po.business.crm.contact.Contact;

@Projection(name  = "crmContactProjection" , types = {Contact.class})
public interface CRMContactProjection {
	
	Long getId();
	
	
	String getFirstName();
	

	String getSecondName();
	
	
	String getLastName();


	Date getPwdlastChanged();
	
	
	String getAuthenticateId();
	
	
	boolean isAdmin();
	
	
	boolean isDeleted();
	
	
	boolean superAdmin();
	
	
	String getTitle();
	
	
	String getPhoneHome();
	
	
	String getMobileHome();
	
	
	String getMobileWork();
	
	
	String getPhoneWork();
	
	
	boolean isAccessible();
}
