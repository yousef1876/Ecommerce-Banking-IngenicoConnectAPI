package com.hr.framework.repo;

import com.hr.framework.po.person.Gender;
import com.hr.framework.projections.persons.GenderPersonProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "genderPerson" , path = "genderPerson" , excerptProjection = GenderPersonProjection.class)
public interface GenderPersonRepository extends PagingAndSortingRepository<Gender,Long>{

    List<Gender> findById(Long id);



}
