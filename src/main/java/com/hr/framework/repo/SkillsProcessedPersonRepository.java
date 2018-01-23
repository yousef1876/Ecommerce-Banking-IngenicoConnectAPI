package com.hr.framework.repo;


import com.hr.framework.po.person.SkillsProcessed;
import com.hr.framework.projections.persons.SkillsProcessedPersonProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "skillProcessed" , path = "skillProcessed" , excerptProjection = SkillsProcessedPersonProjection.class)
public interface SkillsProcessedPersonRepository extends PagingAndSortingRepository<SkillsProcessed,Long>{

   List<SkillsProcessed> findById(Long id);

}
