package com.hr.framework.projections.issues;

import com.enums.IssueType;
import com.hr.framework.po.issue.tracking.users.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "issueProjection" , types = {Issue.class})
public interface IssueProjection {

   Long getId();


   String getIssueName();


    String getIssueTitle();


    String getIssueSummary();


    Date getEstimatedDate();


    Date getActualSpentDate();


    IssueType getTypes();



    IssueStatus getStatus();


    Resolution getResolution();



    Severity getSeverity();


    Project getProjects();


    IssuePriority getIssuePriority();
}
