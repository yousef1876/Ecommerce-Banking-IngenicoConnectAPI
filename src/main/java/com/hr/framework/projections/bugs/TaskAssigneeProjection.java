package com.hr.framework.projections.bugs;

import com.hr.framework.po.bug.tracking.users.Project;
import com.hr.framework.po.bug.tracking.users.ProjectVersion;
import com.hr.framework.po.bug.tracking.users.TaskAssignee;
import com.hr.framework.po.employee.base.Employee;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "taskassignee" , types = {TaskAssignee.class})
public interface TaskAssigneeProjection {

    String getTaskTitle();

    String getTaskName();

    Employee getSuperRole();

    Long getId();

    Employee getAssignTo();

    boolean isUrgent();


    Project getProjects();


    ProjectVersion getVersions();
}
