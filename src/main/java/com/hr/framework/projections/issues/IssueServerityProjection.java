package com.hr.framework.projections.issues;


import com.hr.framework.po.issue.tracking.users.Severity;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "issueServerity" , types = {Severity.class})
public interface IssueServerityProjection {

    Long getId();

    String getServerityCode();


    String getServerityName();


    String getServerityRank();

}
