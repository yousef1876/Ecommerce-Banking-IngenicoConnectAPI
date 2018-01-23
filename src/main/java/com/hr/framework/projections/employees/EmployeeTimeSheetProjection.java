package com.hr.framework.projections.employees;


import com.hr.framework.po.bug.tracking.users.Project;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.TimeSheet;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "employeeTimesheetProjection" , types = {TimeSheet.class})
public interface EmployeeTimeSheetProjection {

    Long getId();


    String getSheetName();


    Date getSheetDate();


    Employee getEmployess();


    Project getProjects();


    Date getCheckIn();


    Date getCheckOut();

}
