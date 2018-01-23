package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.events.IndexRecordEvent;
import com.hr.framework.projections.business.crm.CRMIndexRecordEventProjection;

@RepositoryRestResource(collectionResourceRel = "crmIdexEventDatabase" , path  = "crmIdexEventDatabase" , excerptProjection = CRMIndexRecordEventProjection.class)
public interface CRMIdexRecordEventRepository extends PagingAndSortingRepository<IndexRecordEvent, Long>{
	
	
	List<IndexRecordEvent> findAll();
	List<IndexRecordEvent> findById(Long id);

}
