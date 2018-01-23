package com.hr.framework.projections.business.crm;

import org.springframework.data.rest.core.config.Projection;

import com.hr.framework.po.business.crm.calls.CallContact;
import com.hr.framework.po.business.crm.calls.Calls;
import com.hr.framework.po.business.crm.contact.Contact;

@Projection(name  = "crmCallContactProjection" , types = {CallContact.class})
public interface CRMCallContactProjection {
	
	
	Long getId();
	
	
	Contact getContacts();
	
	
	Calls getCalls();
	
	
	boolean isRequired();

	boolean isDeleted();
	
	
	String getDescription();
	
	
	String getNote();
	
	
	String getComments();
}
