package com.hr.framework.projections.employees.reports;

import com.hr.framework.po.employee.base.reports.PlanActivity;
import com.hr.framework.po.employee.base.reports.RecruitingPlan;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "employeePlanProjection" , types = {PlanActivity.class})
public interface EmployeePlanActivityProjection {

    boolean getInProgress();


    Long getId();


    boolean getIsCompleted();

    String getResult();


    RecruitingPlan getPlan();

}
