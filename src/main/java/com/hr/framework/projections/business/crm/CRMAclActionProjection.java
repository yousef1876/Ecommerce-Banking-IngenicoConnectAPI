package com.hr.framework.projections.business.crm;

import org.springframework.data.rest.core.config.Projection;

import com.enums.AclType;
import com.enums.ActionCategory;
import com.hr.framework.po.business.crm.aclactions.AclActions;
import com.hr.framework.po.business.crm.aclactions.Actions;
import com.hr.framework.po.business.crm.users.AssignedUsers;

@Projection(name  = "crmAclActionProjection" , types = {AclActions.class})
public interface CRMAclActionProjection {

	Long getId();
	
	ActionCategory getActionCategory();
	
	AclType getTypes();
	
	
	boolean isDeleted();
	
	
	Actions getActions();
	
	
	AssignedUsers getUsers();
}
