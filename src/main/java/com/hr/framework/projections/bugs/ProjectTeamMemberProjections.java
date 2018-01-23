package com.hr.framework.projections.bugs;

import com.hr.framework.po.bug.tracking.users.*;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.person.Person;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "projectTeamProjection" , types = {ProjectTeamMember.class})
public interface ProjectTeamMemberProjections {

    Long getId();

    Person getPersons();

    Employee getEmployees();

    ProjectVersion getVersions();


}
