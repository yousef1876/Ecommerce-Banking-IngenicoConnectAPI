package com.hr.framework.projections.business.crm;

import org.springframework.data.rest.core.config.Projection;

import com.hr.framework.po.business.crm.calls.CallReschedule;
import com.hr.framework.po.business.crm.calls.Calls;
import com.hr.framework.po.business.crm.users.AssignedUsers;

@Projection(name  = "crmCallRescheduleProjection" , types = {CallReschedule.class})
public interface CRMCallRescheduleProjection {
	
	
	Long getId();
	
	
	Calls getCalls();
	
	
	AssignedUsers getAssignedUsers();
	
	
	String getReason();
	
	boolean isDeleted();
	
	
	String getDescription();

}
