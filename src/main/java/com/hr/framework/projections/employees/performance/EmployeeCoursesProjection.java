package com.hr.framework.projections.employees.performance;

import com.hr.framework.po.employee.base.Department;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.performance.EmployeeCourses;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "employeeCoursesProjection" , types = {EmployeeCourses.class})
public interface EmployeeCoursesProjection {


    Date getStartDate();


    Date getEndDate();


    Long getId();


    Department getDepartments();


    String getCourseName();

    Employee getEmployees();
}
