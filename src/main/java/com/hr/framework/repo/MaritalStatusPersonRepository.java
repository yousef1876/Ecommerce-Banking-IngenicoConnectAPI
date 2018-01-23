package com.hr.framework.repo;


import com.hr.framework.po.person.MaritalStatus;
import com.hr.framework.projections.persons.MaritalStatusPersonProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "maritalStatusPerson" , path =  "maritalStatusPerson" , excerptProjection = MaritalStatusPersonProjection.class)
public interface MaritalStatusPersonRepository extends PagingAndSortingRepository<MaritalStatus,Long>{

    List<MaritalStatus> findById(Long id);

}
