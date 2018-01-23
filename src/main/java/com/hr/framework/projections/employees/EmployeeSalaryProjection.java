package com.hr.framework.projections.employees;


import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.Salary;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "employeeSalaryProjection" , types = {Salary.class})
public interface EmployeeSalaryProjection {

    Long getId();


    String getCurrency();


    Employee getEmployees();

}
