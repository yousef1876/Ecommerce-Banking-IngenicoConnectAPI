package com.hr.framework.repo;


import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.projections.employees.EmployeepProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource( collectionResourceRel = "employee" , path = "employee" , excerptProjection = EmployeepProjection.class)
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long>{

    List<Employee> findById(Long id);

}
