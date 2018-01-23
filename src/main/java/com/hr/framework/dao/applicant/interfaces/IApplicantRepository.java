package com.hr.framework.dao.applicant.interfaces;

import com.hr.framework.po.applicant.Applicant;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("applicantRepository")
public interface IApplicantRepository {

    List<Applicant> findByApplicant(Applicant model);
}
