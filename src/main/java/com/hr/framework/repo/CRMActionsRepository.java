package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.aclactions.Actions;
import com.hr.framework.projections.business.crm.CRMActionsProjection;

@RepositoryRestResource(collectionResourceRel = "crmActions" , path = "crmActions" , excerptProjection = CRMActionsProjection.class)
public interface CRMActionsRepository extends PagingAndSortingRepository<Actions, Long>{
	
	List<Actions> findAll();

}
