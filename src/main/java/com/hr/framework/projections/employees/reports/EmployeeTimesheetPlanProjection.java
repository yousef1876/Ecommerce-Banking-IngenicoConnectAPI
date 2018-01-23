package com.hr.framework.projections.employees.reports;


import com.hr.framework.po.employee.base.reports.TimesheetPlan;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "employeeTimesheetPlan" , types = {TimesheetPlan.class})
public interface EmployeeTimesheetPlanProjection {

    Long getId();

    Date getFromDat();

    Date getToDate();


    String gerRegularHours();


    String getOverTimeHourlyRate();

    boolean getSick();


    boolean getVaction();


    boolean getHolidy();


    String getTotalHours();


    boolean getInWork();


    boolean getOutWork();


    boolean getPersonalLeave();


    boolean getWorkLeave();

}
