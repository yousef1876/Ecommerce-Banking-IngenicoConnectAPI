package com.hr.framework.projections.bugs;

import com.hr.framework.po.bug.tracking.users.Teams;
import com.hr.framework.po.employee.base.Employee;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "teamsProjections" , types = {Teams.class})
public interface TeamsProjections {

    String getTeamName();

    Long getId();

    Date getCreateDate();

    Employee getSuperRole();

}
