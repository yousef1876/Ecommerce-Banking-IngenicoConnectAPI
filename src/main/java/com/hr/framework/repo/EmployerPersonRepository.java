package com.hr.framework.repo;

import com.hr.framework.po.person.Employer;
import com.hr.framework.projections.persons.EmployerProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employerPerson" , path = "employerPerson" , excerptProjection = EmployerProjection.class)
public interface EmployerPersonRepository extends PagingAndSortingRepository<Employer,Long>{

    List<Employer> findById(Long id);

}
