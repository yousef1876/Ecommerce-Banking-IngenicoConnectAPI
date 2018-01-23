package com.hr.framework.projections.issues;


import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.issue.tracking.users.Issue;
import com.hr.framework.po.issue.tracking.users.IssueComment;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "issueCommentsProjection" , types = {IssueComment.class})
public interface IssueCommentsProjection {


    Long getId();


    String getTitle();


    String getText();


    String getComments();


    Issue getIssues();


    Date getCreatedDate();



    Date getUpdatedDate();


    Employee getCreatedBy();


}
