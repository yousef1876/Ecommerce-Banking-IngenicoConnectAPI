package com.hr.framework.repo;


import com.hr.framework.po.person.Contact;
import com.hr.framework.projections.persons.ContactProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "contactPerson" , path =  "contactPerson" , excerptProjection = ContactProjection.class)
public interface PersonContactRepository extends PagingAndSortingRepository<Contact,Long>{


    List<Contact> findById(Long id);

}
