package com.hr.framework.projections.applicant;

import com.hr.framework.po.applicant.ApplicantInterviewedBy;
import com.hr.framework.po.applicant.Interviews;
import com.hr.framework.po.employee.base.Employee;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = ApplicantInterviewedBy.class , name = "applicantInterviewedBy")
public interface ApplicantInterviewedByProjection {

    Interviews getInterviews();

    Employee getEmployee();

    Long getId();

    boolean isActive();

}
