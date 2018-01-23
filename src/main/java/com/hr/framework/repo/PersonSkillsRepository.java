package com.hr.framework.repo;


import com.hr.framework.po.person.Skills;
import com.hr.framework.projections.persons.PersonSkillsProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "personSkills" , path = "personSkills" , excerptProjection = PersonSkillsProjection.class)
public interface PersonSkillsRepository extends PagingAndSortingRepository<Skills,Long>{

    List<Skills> findById(Long id);

}
