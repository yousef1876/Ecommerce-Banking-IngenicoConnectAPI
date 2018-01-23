package com.hr.framework.dao.applicant.interfaces;

import com.hr.framework.po.applicant.ApplicantExperience;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("applicantExperienceRepository")
public interface IApplicantExperience {

    List<ApplicantExperience> findAllByApplicant();

}
