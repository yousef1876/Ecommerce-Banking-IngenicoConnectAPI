package com.hr.framework.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.framework.po.business.crm.crons.jobs.queue.JobQueue;
import com.hr.framework.projections.business.crm.CRMJobQueueProjection;

@RepositoryRestResource(collectionResourceRel = "crmJobQueue" , path = "crmJobQueue" , excerptProjection = CRMJobQueueProjection.class)
public interface CRMJobQueueRepository extends PagingAndSortingRepository<JobQueue,Long>{
	
	List<JobQueue> findAll();
	
	List<JobQueue> findById(Long id);

}
