package com.hr.framework.repo;


import com.hr.framework.po.employee.base.reports.RecruitingPlan;
import com.hr.framework.projections.employees.reports.EmployeeRecruitingPlanProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeerecuritingplan" , path = "employeerecuritingplan" , excerptProjection = EmployeeRecruitingPlanProjection.class)
public interface EmployeeRecuritingPlanRepository extends PagingAndSortingRepository<RecruitingPlan,Long>{

    List<RecruitingPlan> findById(Long id);

}
