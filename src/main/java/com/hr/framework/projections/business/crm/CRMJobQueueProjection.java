package com.hr.framework.projections.business.crm;

import org.springframework.data.rest.core.config.Projection;

import com.enums.JobQueueStatus;
import com.hr.framework.po.business.crm.crons.jobs.queue.JobQueue;
import com.hr.framework.po.business.crm.users.AssignedUsers;

@Projection(name  = "crmJobQueueProjection" , types = {JobQueue.class})
public interface CRMJobQueueProjection {
	
	Long getId();
	
	String getName();
	
	String getDescription();
	
	
	String getNote();
	
	
	boolean isDeleted();
	
	
	AssignedUsers getAssignedUsers();

	
	JobQueueStatus getStatus();
	
	
	String getText();
	
	
	String getMessage();
}
