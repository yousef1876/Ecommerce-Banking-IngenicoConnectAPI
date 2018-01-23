package com.hr.framework.projections.employees.reports;


import com.enums.Colors;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.reports.MonthlyTeamWorkSchedule;
import com.hr.framework.po.employee.base.reports.MonthlyWorkSchedule;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "employeeMonthlyTeamScheduleProjection" , types = {MonthlyTeamWorkSchedule.class})
public interface EmployeeMonthlyTeamWorkScheduleProjection {

    Long getId();

    Employee getEmployees();

    Date getDate();

    String getEvent();


    MonthlyWorkSchedule getSchedule();


    Colors getColor();

}
