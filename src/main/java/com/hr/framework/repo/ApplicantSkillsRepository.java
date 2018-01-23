package com.hr.framework.repo;

import com.hr.framework.po.applicant.ApplicantSkills;
import com.hr.framework.projections.applicant.ApplicantSkillsProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "skills" , path="skills" , excerptProjection = ApplicantSkillsProjection.class)
public interface ApplicantSkillsRepository extends PagingAndSortingRepository<ApplicantSkills,Long>{

    List<ApplicantSkills> findById(Long id);


}
