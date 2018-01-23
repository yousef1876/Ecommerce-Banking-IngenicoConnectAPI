package com.hr.framework.repo;


import com.hr.framework.po.employee.base.reports.VacationScheduleTemplate;
import com.hr.framework.projections.employees.reports.EmployeeVacationPlanTemplateProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeevacationschedule" , path = "employeevacationschedule" , excerptProjection = EmployeeVacationPlanTemplateProjection.class)
public interface EmployeeVacationScheduleRepository extends PagingAndSortingRepository<VacationScheduleTemplate,Long>{

    List<VacationScheduleTemplate> findById(Long id);
}
