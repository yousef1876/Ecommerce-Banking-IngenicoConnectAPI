package com.hr.framework.projections.business.crm;

import org.springframework.data.rest.core.config.Projection;

import com.hr.framework.po.business.crm.events.IndexRecordEvent;
import com.hr.framework.po.business.crm.users.AssignedUsers;

@Projection(name  = "crmIndexRecordEventProjection" , types = {IndexRecordEvent.class})
public interface CRMIndexRecordEventProjection {
	
	Long getId();
	
	String getName();
	
	boolean isDeleted();
	
	
	AssignedUsers getAssignedUsers();
	
	
	String getError();
	
	
	boolean isSuccess();

	
	String getRecordId();
	
	
	String getTableName();
}
