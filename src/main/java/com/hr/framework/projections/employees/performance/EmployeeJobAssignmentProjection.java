package com.hr.framework.projections.employees.performance;

import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.performance.EmployeeJobAssignment;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "employeeJobAssignment" , types = {EmployeeJobAssignment.class})
public interface EmployeeJobAssignmentProjection {

    Date getStartDate();


    Date getFinishedDate();


    Employee getEmployees();


    String getAssignmentName();


    Employee getAdmins();

}
