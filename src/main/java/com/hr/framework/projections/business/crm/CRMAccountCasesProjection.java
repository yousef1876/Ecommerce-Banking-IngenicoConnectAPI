package com.hr.framework.projections.business.crm;

import org.springframework.data.rest.core.config.Projection;

import com.hr.framework.po.business.crm.Accounts;
import com.hr.framework.po.business.crm.AccountsCases;
import com.hr.framework.po.business.crm.users.AssignedUsers;

@Projection(name  = "crmAccountCasesProjection" , types = {AccountsCases.class})
public interface CRMAccountCasesProjection {
	
	
	Long getId();
	
	
	AssignedUsers getAssignedUsers();
	
	
	Accounts getAccounts();

    
	String getAuthType();


}
