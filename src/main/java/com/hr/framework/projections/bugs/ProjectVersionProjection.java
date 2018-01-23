package com.hr.framework.projections.bugs;


import com.hr.framework.po.bug.tracking.users.Project;
import com.hr.framework.po.bug.tracking.users.ProjectVersion;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "projectVersion" , types = {ProjectVersion.class})
public interface ProjectVersionProjection {

    String getVersionName();

    String getVersionNumber();

    Date getDeadLine();

    Project getProjects();

    Long getId();


}
