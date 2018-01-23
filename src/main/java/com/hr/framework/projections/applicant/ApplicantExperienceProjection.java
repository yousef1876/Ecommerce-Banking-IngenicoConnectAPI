package com.hr.framework.projections.applicant;

import com.hr.framework.po.applicant.Applicant;
import com.hr.framework.po.applicant.ApplicantExperience;
import com.hr.framework.po.person.Employer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "experienceProjection" , types = {ApplicantExperience.class})
public interface ApplicantExperienceProjection {

    Long getId();

    Applicant getApplicant();

    String getYears();

    Employer getEmployer();
}
