package com.hr.framework.repo;

import com.hr.framework.po.employee.performance.EmployeeTrainingHistory;
import com.hr.framework.projections.employees.performance.EmployeeTrainingHistoryProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeeTrainingHistory" , path = "employeeTrainingHistory" , excerptProjection = EmployeeTrainingHistoryProjection.class)
public interface EmployeeTrainingHistoryRepository extends PagingAndSortingRepository<EmployeeTrainingHistory,Long>{

    List<EmployeeTrainingHistory> findById(Long id);

}
