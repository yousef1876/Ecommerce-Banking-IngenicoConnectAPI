package com.hr.framework.projections.business.crm;

import org.springframework.data.rest.core.config.Projection;

import com.enums.FixedAssetTypes;
import com.hr.framework.po.business.crm.assets.Assets;
import com.hr.framework.po.business.crm.products.Products;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import com.hr.framework.po.business.parties.AgreementParty;

@Projection(name  = "crmAssetsProjection" , types = {Assets.class})
public interface CRMAssetsProjection {
	
	Long getId();
	
	String getAssetsSerialNumber();
	

	FixedAssetTypes getType();
	
	
	Assets getParent();
	
	
	Products getProducts();
	
	
	AgreementParty getParts();
	
	
	AssignedUsers getUsers();

    
	String getAssetName();
	
	
	String getDescription();
	
	String getNote();
	
	String getComments();
	

}
