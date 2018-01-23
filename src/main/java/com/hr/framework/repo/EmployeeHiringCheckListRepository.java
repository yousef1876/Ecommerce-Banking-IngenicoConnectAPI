package com.hr.framework.repo;

import com.hr.framework.po.employee.base.reports.HireCheckList;
import com.hr.framework.projections.employees.reports.EmployeeHireCheckListProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeehiring" , path = "employeehiring" , excerptProjection = EmployeeHireCheckListProjection.class)
public interface EmployeeHiringCheckListRepository extends PagingAndSortingRepository<HireCheckList,Long> {

   List<HireCheckList> findById(Long id);

}
