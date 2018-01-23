package com.hr.framework.projections.employees.reports;

import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.reports.EmployeeScheduleTemplate;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "employeeScheduleProjection" , types = {EmployeeScheduleTemplate.class})
public interface EmployeeScheduleTemplateProjection {


    Long getId();

    Employee getEmployees();


    String getHours();

    String getPay();


    String getHoursRate();
}
