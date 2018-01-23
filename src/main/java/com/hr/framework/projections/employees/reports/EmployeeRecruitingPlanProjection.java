package com.hr.framework.projections.employees.reports;

import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.reports.RecruitingPlan;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "employeeRecruitingPlanProjection" , types = {RecruitingPlan.class})
public interface EmployeeRecruitingPlanProjection {

    String getTitle();

    Long getId();

    String getComments();


    Employee getEmployees();


}
