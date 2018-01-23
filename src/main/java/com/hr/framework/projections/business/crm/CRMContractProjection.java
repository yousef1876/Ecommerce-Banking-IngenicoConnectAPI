package com.hr.framework.projections.business.crm;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.enums.ContractStatus;
import com.hr.framework.po.business.crm.contact.Contact;
import com.hr.framework.po.business.crm.contract.Contract;
import com.hr.framework.po.business.crm.users.AssignedUsers;

@Projection(name  = "crmContractProjection" , types = {Contract.class})
public interface CRMContractProjection {
	
	Long getId();
	
	String getName();
	
	
	String getDescription();
	
	
	String getNote();
	
	
	boolean isDeleted();
	
	
	AssignedUsers getUsers();
	
	
	String getReferenceCode();
	
	
	Date getFromDate();
	
	
	Date getToDate();

	
	String getTotalContractValue();
	
	
	String getUsDollar();
	
	
	String getCurrency();
	
	
	ContractStatus getContractStatus();
	
	
	Date getCustomerSignedDate();
	
	
	Date getCompanySignedDate();
	
	
	Contact getContacts();
}
