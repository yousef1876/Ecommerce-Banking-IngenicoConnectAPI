package com.hr.framework.repo;


import com.hr.framework.po.person.Employeed;
import com.hr.framework.projections.persons.EmployeedProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeedPerson" , path = "employeedPerson" , excerptProjection = EmployeedProjection.class)
public interface EmployeedRepository extends PagingAndSortingRepository<Employeed,Long>{

    List<Employeed> findById(Long id);

}
