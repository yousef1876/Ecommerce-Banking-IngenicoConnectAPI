package com.hr.framework.repo;

import com.hr.framework.po.applicant.ApplicantQualification;
import com.hr.framework.projections.applicant.ApplicantQualificationProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "qualification" , path = "qualification" , excerptProjection = ApplicantQualificationProjection.class)
public interface ApplicantQualificationRepository extends PagingAndSortingRepository<ApplicantQualification,Long>{


    List<ApplicantQualification> findById(Long id);




}


