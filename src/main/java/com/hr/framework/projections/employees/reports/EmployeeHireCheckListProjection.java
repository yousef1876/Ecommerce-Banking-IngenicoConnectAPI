package com.hr.framework.projections.employees.reports;

import com.hr.framework.po.employee.base.reports.HireCheckList;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "employeeCheckProjection" , types = {HireCheckList.class})
public interface EmployeeHireCheckListProjection {

      Long getId();


}
