package com.hr.framework.projections.employees;

import com.hr.framework.po.employee.base.Bonus;
import com.hr.framework.po.employee.base.Employee;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "bounsProjection" , types = {Bonus.class})
public interface BonusProjection {

    Employee getEmployees();

    String getBonus();

    Date getStartedMonth();


}
