package com.hr.framework.projections.issues;

import com.hr.framework.po.issue.tracking.users.Issue;
import com.hr.framework.po.issue.tracking.users.IssueAttachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "issueAttachmentProjection" , types = {IssueAttachment.class})
public interface IssueAttachmentProjection {

    Long getId();

    String getAttachmentTitle();


    String getAttachmentFileName();


    String getFileType();

    byte[] getBody();


    Issue getIssues();

}
