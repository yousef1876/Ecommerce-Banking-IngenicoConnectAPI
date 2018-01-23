package com.hr.framework.projections.employees;

import com.hr.framework.po.employee.base.Department;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "departmentProjection" , types = {Department.class})
public interface DepartmentProjection {


    String getDeptName();

    Department getDepartment();

    String getDescription();


    Long getId();


}
