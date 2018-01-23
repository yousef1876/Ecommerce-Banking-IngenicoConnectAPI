package com.hr.framework.repo;


import com.hr.framework.po.employee.base.TimeSheet;
import com.hr.framework.projections.employees.EmployeeTimeSheetProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource( collectionResourceRel = "employeeTimesheet" , path = "employeeTimesheet" , excerptProjection = EmployeeTimeSheetProjection.class)
public interface EmployeeTimeSheetRepository extends PagingAndSortingRepository<TimeSheet,Long>{

    List<TimeSheet> findById(Long id);
}
