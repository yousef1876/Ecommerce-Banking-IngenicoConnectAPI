package com.hr.framework.projections.employees;


import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.EmployeePicture;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "pictureEmployeeProjection" , types =  {EmployeePicture.class})
public interface EmployeePictureProjection {


    byte[] getPicture();


    String getFile();


    Employee getEmployees();
}
