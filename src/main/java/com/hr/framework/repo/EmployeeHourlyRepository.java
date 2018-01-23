package com.hr.framework.repo;


import com.hr.framework.po.employee.base.Hourly;
import com.hr.framework.projections.employees.EmployeeHourlyProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeehourly" , path = "employeehourly" , excerptProjection = EmployeeHourlyProjection.class)
public interface EmployeeHourlyRepository extends PagingAndSortingRepository<Hourly,Long>{

    List findById(Long id);

}
