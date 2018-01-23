package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.cases.Cases;
import com.hr.framework.projections.business.crm.CRMCasesProjection;

@RepositoryRestResource(collectionResourceRel = "crmCases" , path = "crmCases" , excerptProjection = CRMCasesProjection.class)
public interface CRMCasesRepository extends PagingAndSortingRepository<Cases, Long>{
	
	List<Cases> findById(Long id);

}
