package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.Accounts;
import com.hr.framework.projections.business.crm.CRMAccountsProjection;

@RepositoryRestResource(collectionResourceRel = "crmAccounts" , path = "crmAccounts" , excerptProjection = CRMAccountsProjection.class)
public interface CRMAccountsRepository extends PagingAndSortingRepository<Accounts, Long>{
	
	
	List<Accounts> findById(Long id);

}
