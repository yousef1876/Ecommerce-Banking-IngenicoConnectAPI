package com.hr.framework.projections.employees;


import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.PayRoll;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "employeePayrollProjection" , types = {PayRoll.class})
public interface EmployeePayrollProjection {

    Long getId();

    Employee getEmployees();


    String getDiscount();


    Date getBeginDate();


    Date getEndDate();


    String getHourWorked();



}
