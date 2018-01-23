package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.calls.CallContact;
import com.hr.framework.projections.business.crm.CRMCallContactProjection;

@RepositoryRestResource(collectionResourceRel = "crmCallContact" , path = "crmCallContact" , excerptProjection = CRMCallContactProjection.class)
public interface  CRMCallContactRepository extends PagingAndSortingRepository<CallContact, Long>{
	
	
	List<CallContact> findById(Long id);

}
