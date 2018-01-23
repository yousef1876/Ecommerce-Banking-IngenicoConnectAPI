package com.hr.framework.projections.bugs;

import com.hr.framework.po.bug.tracking.users.Project;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "projectInfo" , types = {Project.class})
public interface ProjectInfoProjection {


    Long getId();

    String getProjectName();

    String getProjectTitle();

    Date getFromDate();

    Date getToDate();


}
