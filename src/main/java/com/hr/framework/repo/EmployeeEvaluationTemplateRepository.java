package com.hr.framework.repo;

import com.hr.framework.po.employee.base.reports.EmployeeEvaluationTemplate;
import com.hr.framework.projections.employees.reports.EmployeeEvaluationTemplateProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeeEvaluation" , path = "employeeEvaluation" , excerptProjection = EmployeeEvaluationTemplateProjection.class)
public interface EmployeeEvaluationTemplateRepository extends PagingAndSortingRepository<EmployeeEvaluationTemplate,Long>{

    List<EmployeeEvaluationTemplate> findById(Long id);

}
