package com.hr.framework.projections.applicant;

import com.hr.framework.po.applicant.Applicant;
import com.hr.framework.po.applicant.ApplicantQualification;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "applicantQualificationProjection" , types = {ApplicantQualification.class})
public interface ApplicantQualificationProjection {

    String getUniversityName();

    String getGPA();

    String getMajor();

    String getFaculty();

    Date getStartDate();

    Date getEndDate();

    Applicant getApplicant();

    Long getId();

}
