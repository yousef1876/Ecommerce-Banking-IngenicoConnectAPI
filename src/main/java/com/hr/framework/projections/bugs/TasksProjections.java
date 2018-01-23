package com.hr.framework.projections.bugs;

import com.hr.framework.po.bug.tracking.users.Phases;
import com.hr.framework.po.bug.tracking.users.Project;
import com.hr.framework.po.bug.tracking.users.ProjectVersion;
import com.hr.framework.po.bug.tracking.users.Tasks;
import com.hr.framework.po.employee.base.Employee;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "tasks" , types = {Tasks.class})
public interface TasksProjections {

    String getTaskName();

    String getTaskTitle();

    Date getAddedDate();

    Date getModifiedDate();


    Employee getEmployees();

    Project getProjects();


    Phases getPhases();

    Employee getEmployeesModified();

    Employee getAssignTo();

    ProjectVersion getVersions();

    Long getId();

}
