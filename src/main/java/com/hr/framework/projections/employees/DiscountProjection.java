package com.hr.framework.projections.employees;


import com.hr.framework.po.employee.base.Discount;
import com.hr.framework.po.employee.base.Employee;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "discountProjection" , types = {Discount.class})
public interface DiscountProjection {

    String getType();


    Employee getEmployee();


    Long getId();




}
