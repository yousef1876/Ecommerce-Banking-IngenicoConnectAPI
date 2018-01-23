package com.hr.framework.projections.issues;

import com.hr.framework.po.issue.tracking.users.Resolution;
import com.hr.framework.po.issue.tracking.users.Users;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "issueReolutionProjection" , types = {Resolution.class})
public interface IssueResolutionProjection {

    Long getId();


    String getSummary();


    Date getAddedDate();


    Users getAddedBy();



}
