package com.hr.framework.projections.issues;

import com.hr.framework.po.issue.tracking.users.Project;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "issueProjectsProjection" , types = {Project.class})
public interface ProjectProjection {


    Long getId();


    String getProjectName();


    String getProjectTitle();


    String getProjectCode();

    Date getFromDate();

    Date getToDate();


}
