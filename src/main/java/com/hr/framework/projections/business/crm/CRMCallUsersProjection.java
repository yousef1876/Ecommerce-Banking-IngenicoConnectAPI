package com.hr.framework.projections.business.crm;

import org.springframework.data.rest.core.config.Projection;

import com.enums.CallAcceptStatus;
import com.hr.framework.po.business.crm.calls.CallUsers;
import com.hr.framework.po.business.crm.calls.Calls;
import com.hr.framework.po.business.crm.users.AssignedUsers;

@Projection(name = "crmCallUsersProjection" , types = {CallUsers.class})
public interface CRMCallUsersProjection {
	
	Long getId();
	
	Calls getCalls();
	
	
	AssignedUsers getAssignedUsers();
	
	
	boolean isDeleted();
	
	
	boolean isRequired();
	
	
	CallAcceptStatus getStatus();
	
	
	String getDescription();
	
	
	String getNote();
	
	
	String getComments();

}
