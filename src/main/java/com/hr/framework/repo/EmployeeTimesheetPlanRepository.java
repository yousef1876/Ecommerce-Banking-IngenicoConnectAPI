package com.hr.framework.repo;


import com.hr.framework.po.employee.base.reports.TimesheetPlan;
import com.hr.framework.projections.employees.reports.EmployeeTimesheetPlanProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeetimesheet" , path = "employeetimesheet" , excerptProjection = EmployeeTimesheetPlanProjection.class)
public interface EmployeeTimesheetPlanRepository extends PagingAndSortingRepository<TimesheetPlan,Long>{


    List<TimesheetPlan> findById(Long id);

}
