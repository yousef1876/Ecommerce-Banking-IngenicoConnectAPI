package com.hr.framework.projections.employees.reports;

import com.hr.framework.po.bug.tracking.users.Tasks;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.reports.TransitionPlanTemplate;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "employeeTransitionTemplate" , types = {TransitionPlanTemplate.class})
public interface EmployeeTransitionPalnTemplateProjection {

    Long getId();

    Employee getEmployees();

    String getGoal();


    String getRisk();

    Tasks getTasks();

    Date getFromDate();

    Date getToDate();
}
