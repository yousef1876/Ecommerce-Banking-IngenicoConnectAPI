package com.hr.framework.projections.employees.reports;


import com.enums.AttendanceType;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.reports.EmployeeAttendanceTracker;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "employeeAttendance" , types = {EmployeeAttendanceTracker.class})
public interface EmployeeAttendanceTrackerProjection {

     Long getId();

    Employee getEmployees();


    AttendanceType getType();

}
