package com.hr.framework.projections.business.crm;

import org.springframework.data.rest.core.config.Projection;

import com.enums.CasePriority;
import com.enums.CaseStatus;
import com.hr.framework.po.business.crm.cases.Cases;
import com.hr.framework.po.business.crm.users.AssignedUsers;

@Projection(name  = "crmCasesProjection" , types = {Cases.class})
public interface CRMCasesProjection {
	
	
	Long getId();
	
	String getCaseName();
	
	String getCaseTitle();
	
	
	String getDescription();
	
	
	String getNote();
	
	
	boolean isDeleted();
	
	
	String getCaseNumber();
	
	
	CaseStatus getStatus();
	
	
	CasePriority getCasePriority();
	
	
	AssignedUsers getAssignedUsers();

}
