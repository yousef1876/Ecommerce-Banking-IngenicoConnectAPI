package com.hr.framework.projections.business.crm;

import org.springframework.data.rest.core.config.Projection;

import com.hr.framework.po.business.crm.aclactions.Actions;

@Projection(name  = "crmActionsProjection" , types = {Actions.class})
public interface CRMActionsProjection {
	
	
	Long getId();
	
	String getUrl();
	
	String getMethods();
	
	String getClazz();

}
