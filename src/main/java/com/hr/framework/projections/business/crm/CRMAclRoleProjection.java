package com.hr.framework.projections.business.crm;

import java.util.List;

import org.springframework.data.rest.core.config.Projection;

import com.hr.framework.po.business.crm.aclactions.AclRoles;
import com.hr.framework.po.business.crm.aclactions.Actions;
import com.hr.framework.po.business.crm.users.AssignedUsers;

@Projection(name  = "crmAclRoleProjection" , types = {AclRoles.class})
public interface CRMAclRoleProjection {
	
	
	Long getId();
	
	List<Actions> getActionsList();
	
	List<AssignedUsers> getUsers();

}
