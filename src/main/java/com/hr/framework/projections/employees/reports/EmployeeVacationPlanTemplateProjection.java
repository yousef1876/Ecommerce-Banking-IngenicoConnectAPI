package com.hr.framework.projections.employees.reports;

import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.reports.VacationScheduleTemplate;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "employeeVacationScheduleTemplate" , types = {VacationScheduleTemplate.class})
public interface EmployeeVacationPlanTemplateProjection {

    Employee getEmployees();

    Long getId();

    Date getFromDate();

    Date getToDate();


    String getCommenets();


    String getDescription();
}
