package com.hr.framework.dao.applicant.interfaces;

import com.hr.framework.annotation.SizeField;
import com.hr.framework.dao.applicant.dto.ApplicantAttachmentDTO;
import com.hr.framework.po.applicant.ApplicantAttachment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("applicantAttachmentRepo")
public interface IApplicantAttachment {


    List<ApplicantAttachment> findAllByApplicant(ApplicantAttachmentDTO dto);


}
