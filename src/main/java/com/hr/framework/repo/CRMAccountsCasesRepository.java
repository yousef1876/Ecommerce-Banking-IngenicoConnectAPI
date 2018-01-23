package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.AccountsCases;
import com.hr.framework.projections.business.crm.CRMAccountCasesProjection;

@RepositoryRestResource(collectionResourceRel = "crmAccountCases" , path = "crmAccountCases" , excerptProjection = CRMAccountCasesProjection.class)
public interface CRMAccountsCasesRepository extends PagingAndSortingRepository<AccountsCases, Long>{
	
	
	List<AccountsCases> findById(Long id);

}
