package com.hr.framework.repo;

import com.hr.framework.po.person.Job;
import com.hr.framework.projections.persons.JobProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "personJob" , path = "personJob" , excerptProjection = JobProjection.class)
public interface PersonJobRepository extends PagingAndSortingRepository<Job,Long>{

    List<Job> findById(Long id);

}
