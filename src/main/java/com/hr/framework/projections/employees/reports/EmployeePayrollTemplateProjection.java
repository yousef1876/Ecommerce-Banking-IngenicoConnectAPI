package com.hr.framework.projections.employees.reports;


import com.hr.framework.po.address.City;
import com.hr.framework.po.address.Country;
import com.hr.framework.po.applicant.Positions;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.reports.PayrollTemplate;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "employeePayrollProjection" , types = {PayrollTemplate.class})
public interface EmployeePayrollTemplateProjection {

    Employee getEmployees();


    String getComments();


    String getSocialSecurity();


    City getCity();

    Country getCountry();


    Positions getPositions();


}
