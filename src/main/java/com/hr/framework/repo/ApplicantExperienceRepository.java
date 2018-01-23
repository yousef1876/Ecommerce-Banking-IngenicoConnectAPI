package com.hr.framework.repo;

import com.hr.framework.po.applicant.ApplicantExperience;
import com.hr.framework.projections.applicant.ApplicantExperienceProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "experience" , path = "experience" , excerptProjection = ApplicantExperienceProjection.class)
public interface ApplicantExperienceRepository extends PagingAndSortingRepository<ApplicantExperience,Long>{




}
