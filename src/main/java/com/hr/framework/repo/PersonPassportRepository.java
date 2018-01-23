package com.hr.framework.repo;


import com.hr.framework.po.person.Passport;
import com.hr.framework.projections.persons.PersonPassportProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "personPassport" , path = "personPassport" , excerptProjection = PersonPassportProjection.class)
public interface PersonPassportRepository extends PagingAndSortingRepository<Passport,Long>{

    List<Passport> findById(Long id);

}
