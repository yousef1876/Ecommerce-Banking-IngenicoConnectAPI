package com.hr.framework.projections.employees.reports;


import com.enums.EmployeeEvaluationSteps;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.reports.EmployeeEvaluationTemplate;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "employeeEvaluationProjection" , types = {EmployeeEvaluationTemplate.class})
 public interface EmployeeEvaluationTemplateProjection {

    Long getId();

    EmployeeEvaluationSteps getItems();


    Employee getEmployees();


    String getResult();




}
