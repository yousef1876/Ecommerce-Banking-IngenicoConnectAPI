package com.hr.framework.repo;


import com.hr.framework.po.employee.base.EmployeeType;
import com.hr.framework.projections.employees.EmployeeTypeProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeetype" , path = "employeetype" , excerptProjection = EmployeeTypeProjection.class)
public interface EmployeeTypeRepository extends PagingAndSortingRepository<EmployeeType,Long> {

    List<EmployeeType> findById(Long id);

}
