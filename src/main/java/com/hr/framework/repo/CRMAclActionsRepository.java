package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.aclactions.AclActions;
import com.hr.framework.projections.business.crm.CRMAclActionProjection;

@RepositoryRestResource(collectionResourceRel  = "crmAclAction" , path = "crmAclAction" , excerptProjection = CRMAclActionProjection.class)
public interface CRMAclActionsRepository extends PagingAndSortingRepository<AclActions, Long>{
	
	
	List<AclActions> findById(Long id);
	

}
