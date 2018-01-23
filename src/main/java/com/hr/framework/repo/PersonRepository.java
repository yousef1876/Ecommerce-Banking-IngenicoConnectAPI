package com.hr.framework.repo;


import com.hr.framework.po.person.Person;
import com.hr.framework.projections.persons.PersonsProjections;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "persons" , path = "persons" , excerptProjection = PersonsProjections.class)
public interface PersonRepository extends PagingAndSortingRepository<Person,Long>{

    List<Person> findById(Long id);

}
