package com.hr.framework.repo;


import com.hr.framework.po.person.PersonExperience;
import com.hr.framework.projections.persons.PersonExperienceProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "personExperience" , path = "personExperience" , excerptProjection = PersonExperienceProjection.class)
public interface PersonExperienceRepository extends PagingAndSortingRepository<PersonExperience,Long>{

    List<PersonExperience> findById(Long id);

}
