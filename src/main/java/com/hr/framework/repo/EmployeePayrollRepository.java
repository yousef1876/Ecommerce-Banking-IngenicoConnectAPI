package com.hr.framework.repo;


import com.hr.framework.po.employee.base.PayRoll;
import com.hr.framework.projections.employees.EmployeePayrollProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeepayroll" , path = "employeepayroll" , excerptProjection = EmployeePayrollProjection.class)
public interface EmployeePayrollRepository  extends PagingAndSortingRepository<PayRoll,Long>{

    List<PayRoll> findById(Long id);

}
