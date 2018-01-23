package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.calls.Calls;
import com.hr.framework.projections.business.crm.CRMCallsProjection;

@RepositoryRestResource(collectionResourceRel = "crmCalls" , path = "crmCalls" , excerptProjection = CRMCallsProjection.class)
public interface CRMCallsRepository extends PagingAndSortingRepository<Calls, Long>{
	
	List<Calls> findById(Long id);

}
