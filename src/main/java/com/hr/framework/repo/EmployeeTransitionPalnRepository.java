package com.hr.framework.repo;

import com.hr.framework.po.employee.base.reports.TransitionPlanTemplate;
import com.hr.framework.projections.employees.reports.EmployeeTransitionPalnTemplateProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeetransitionplan" , path = "employeetransitionplan" , excerptProjection = EmployeeTransitionPalnTemplateProjection.class)
public interface EmployeeTransitionPalnRepository extends PagingAndSortingRepository<TransitionPlanTemplate,Long>{

    List<TransitionPlanTemplate> findById(Long id);
}
