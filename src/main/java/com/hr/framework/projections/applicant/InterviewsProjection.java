package com.hr.framework.projections.applicant;

import com.hr.framework.po.applicant.Applicant;
import com.hr.framework.po.applicant.Interviews;
import com.hr.framework.po.applicant.Positions;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "interviews" , types = {Interviews.class})
public interface InterviewsProjection {

    Long getId();


    String getTitle();

    Applicant getApplicant();

    Positions getPosition();

}
