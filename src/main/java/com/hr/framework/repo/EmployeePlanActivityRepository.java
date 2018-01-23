package com.hr.framework.repo;

import com.hr.framework.po.employee.base.reports.PlanActivity;
import com.hr.framework.projections.employees.reports.EmployeePlanActivityProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeeplanactivity" , path = "employeeplanactivity"  , excerptProjection = EmployeePlanActivityProjection.class)
public interface EmployeePlanActivityRepository extends PagingAndSortingRepository<PlanActivity,Long>{

   List<PlanActivity> findById(Long id);

}
