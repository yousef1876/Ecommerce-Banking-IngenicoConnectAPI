package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.calls.CallReschedule;
import com.hr.framework.projections.business.crm.CRMCallRescheduleProjection;

@RepositoryRestResource(collectionResourceRel = "crmCallReschedule" , path = "crmCallReschedule" , excerptProjection = CRMCallRescheduleProjection.class)
public interface CRMCallRescheduleRepository extends PagingAndSortingRepository<CallReschedule, Long>{
	
	
	List<CallReschedule> findById(Long id);

}
