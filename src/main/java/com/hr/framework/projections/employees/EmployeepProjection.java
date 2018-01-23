package com.hr.framework.projections.employees;


import com.enums.GenderType;
import com.enums.MaritalStatusType;
import com.hr.framework.po.address.City;
import com.hr.framework.po.address.Country;
import com.hr.framework.po.address.State;
import com.hr.framework.po.employee.base.Department;
import com.hr.framework.po.employee.base.Employee;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "employeeProjection" , types = {Employee.class})
public interface EmployeepProjection {

    String getFirstName();

    String getLastName();

    Date getDob();

    String getSsn();

    GenderType getGenderType();


    MaritalStatusType getMaritalType();


    City city();


    Country getCountry();


    State getState();


    String getEmail();



    String getPhone();


    String getMobile();


    String getWorkMobile();


    String getWorkPhone();


    boolean getAdmin();


    Date getLastLoginDate();


    Department getDepts();

}
