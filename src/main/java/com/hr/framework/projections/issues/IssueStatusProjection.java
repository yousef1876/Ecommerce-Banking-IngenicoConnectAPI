package com.hr.framework.projections.issues;

import com.hr.framework.po.issue.tracking.users.IssueStatus;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "issueStatusProjection" , types = {IssueStatus.class})
public interface IssueStatusProjection {

    Long getId();


    String getStatus();


    String getRank();



}
