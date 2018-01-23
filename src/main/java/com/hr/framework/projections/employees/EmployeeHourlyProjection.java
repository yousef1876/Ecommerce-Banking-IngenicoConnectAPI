package com.hr.framework.projections.employees;


import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.Hourly;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "employeeHourlyProjection" , types = {Hourly.class})
public interface EmployeeHourlyProjection {

    Long getId();


    String getRate();

    Employee getEmployee();

}
