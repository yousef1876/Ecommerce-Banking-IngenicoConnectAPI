package com.hr.framework.projections.employees.performance;

import com.hr.framework.po.employee.base.Department;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.performance.PerformanceReview;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "employeePerformancePreviewProjection" , types = {PerformanceReview.class})
public interface EmployeePerformancePreviewProjection {

    Date getStartDate();

    Long getId();


    Date getEndDate();


    Employee getEmployees();


    Department getDepts();


    String getStageName();


    Employee getAdmins();

}
