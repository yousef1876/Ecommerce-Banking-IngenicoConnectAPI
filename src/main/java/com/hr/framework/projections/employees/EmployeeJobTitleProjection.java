package com.hr.framework.projections.employees;


import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.JobTitle;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "employeeJobTitle" , types = {JobTitle.class})
public interface EmployeeJobTitleProjection {

    Long getId();


    String getJobName();


    Employee getEmployees();


    Employee getSupervisors();

}
