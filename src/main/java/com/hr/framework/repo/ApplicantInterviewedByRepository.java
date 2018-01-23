package com.hr.framework.repo;

import com.hr.framework.po.applicant.ApplicantInterviewedBy;
import com.hr.framework.projections.applicant.ApplicantInterviewedByProjection;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "interviewedBy" , path = "interviewedBy" , excerptProjection = ApplicantInterviewedByProjection.class)
public interface ApplicantInterviewedByRepository {

List<ApplicantInterviewedBy> findById(Long id);



}

