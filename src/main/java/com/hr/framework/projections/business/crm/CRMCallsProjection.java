package com.hr.framework.projections.business.crm;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.enums.CallStatus;
import com.hr.framework.po.business.crm.calls.Calls;
import com.hr.framework.po.business.crm.users.AssignedUsers;

@Projection(name = "crmCallsProjection" , types = {Calls.class})
public interface CRMCallsProjection {
	
	Long getId();
	
	
	String getName();
	
	
	String getDescription();
	
	
	String getNote();
	
	
	boolean isDeleted();
	
	
	Date getHours();
	
	
	Date getFromDate();
	
	
	Date getToDate();

	
	Calls getCalls();
	
	
	CallStatus getStatus();
	
	
	Date getReminderTime();
	
	
	Date getEmailReminderSent();
	
	
	String getOutlook();
	
	
	AssignedUsers getAssignedUsers();
}
