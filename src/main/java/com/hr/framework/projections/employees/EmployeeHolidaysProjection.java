package com.hr.framework.projections.employees;


import com.enums.HolidayType;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.Holidays;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "employeeHolidays" , types = {Holidays.class})
public interface EmployeeHolidaysProjection {

    Date getStartedDay();

    Date getEndDate();


    Employee getEmployees();


    boolean  getIsPaid();


    HolidayType getType();


}
