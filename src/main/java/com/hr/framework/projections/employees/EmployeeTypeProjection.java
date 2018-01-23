package com.hr.framework.projections.employees;


import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.EmployeeType;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "employeeTypeProjection" , types = {EmployeeType.class})
public interface EmployeeTypeProjection {

    String getType();


    Employee getEmployees();

}
