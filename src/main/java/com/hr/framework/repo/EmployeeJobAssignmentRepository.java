package com.hr.framework.repo;


import com.hr.framework.po.employee.performance.EmployeeJobAssignment;
import com.hr.framework.projections.employees.performance.EmployeeJobAssignmentProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeeJobAssignment" , path = "employeeJobAssignment" , excerptProjection = EmployeeJobAssignmentProjection.class)
public interface EmployeeJobAssignmentRepository extends PagingAndSortingRepository<EmployeeJobAssignment,Long>{

    List<EmployeeJobAssignment> findById(Long id);

}
