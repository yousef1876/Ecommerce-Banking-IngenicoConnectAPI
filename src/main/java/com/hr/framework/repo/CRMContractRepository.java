package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.contract.Contract;
import com.hr.framework.projections.business.crm.CRMContractProjection;

@RepositoryRestResource( collectionResourceRel  = "crmContract" , path = "crmContract" , excerptProjection = CRMContractProjection.class)
public interface CRMContractRepository extends PagingAndSortingRepository<Contract, Long> {
	
	
	List<Contract> findById(Long id);
	
	

}
