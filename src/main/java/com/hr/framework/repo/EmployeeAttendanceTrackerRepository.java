package com.hr.framework.repo;


import com.hr.framework.po.employee.base.reports.EmployeeAttendanceTracker;
import com.hr.framework.projections.employees.reports.EmployeeAttendanceTrackerProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeeAttendance" , path = "employeeAttendance" , excerptProjection = EmployeeAttendanceTrackerProjection.class)
public interface EmployeeAttendanceTrackerRepository extends PagingAndSortingRepository<EmployeeAttendanceTracker,Long>{

    List<EmployeeAttendanceTracker> findById(Long id);

}
