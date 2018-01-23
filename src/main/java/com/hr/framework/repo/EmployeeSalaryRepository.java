package com.hr.framework.repo;

import com.hr.framework.po.employee.base.Salary;
import com.hr.framework.projections.employees.EmployeeSalaryProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel =  "employeesalary" , path = "employeesalary" , excerptProjection = EmployeeSalaryProjection.class)
public interface EmployeeSalaryRepository extends PagingAndSortingRepository<Salary,Long>{

    List<Salary> findById(Long id);
}
