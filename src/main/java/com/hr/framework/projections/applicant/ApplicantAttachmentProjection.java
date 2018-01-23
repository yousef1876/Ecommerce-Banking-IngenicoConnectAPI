package com.hr.framework.projections.applicant;

import com.hr.framework.po.applicant.Applicant;
import com.hr.framework.po.applicant.ApplicantAttachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "applicantAttachmentProjection" , types = {ApplicantAttachment.class})
public interface ApplicantAttachmentProjection {

String getFileName();

String getFileType();

Long getId();

Applicant getApplicant();

}
