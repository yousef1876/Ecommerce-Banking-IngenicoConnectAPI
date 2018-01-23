package com.hr.framework.repo;

import com.hr.framework.po.employee.performance.PerformanceReview;
import com.hr.framework.projections.employees.performance.EmployeePerformancePreviewProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeePerformanceReview" , path = "employeePerformanceReview" , excerptProjection = EmployeePerformancePreviewProjection.class)
public interface EmployeePerformancePreviewRepository extends PagingAndSortingRepository<PerformanceReview,Long>{


    List<PerformanceReview> findById(Long id);


}
