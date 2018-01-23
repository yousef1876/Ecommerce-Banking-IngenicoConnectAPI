package com.hr.framework.projections.applicant;

import com.enums.SkillLevel;
import com.hr.framework.po.applicant.Applicant;
import com.hr.framework.po.applicant.ApplicantSkills;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection( name = "skillsProjection" , types = {ApplicantSkills.class})
public interface ApplicantSkillsProjection {

    String getEmployerCode();

    String getSkillName();

    Applicant getApplicant();

    SkillLevel getSkillExpertLevel();

    Date getLastUsed();

    Long getId();
}
