package com.hr.framework.projections.employees.performance;


import com.hr.framework.po.employee.performance.EmployeeCourses;
import com.hr.framework.po.employee.performance.EmployeeTrainingHistory;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "employeeTrainingHistoryProjection"  , types = {EmployeeTrainingHistory.class})
public interface EmployeeTrainingHistoryProjection {

    Long getId();


    String getResults();


    Date getStartDate();


    Date getEndDatre();


    EmployeeCourses getCourses();
}
