package com.hr.framework.repo;

import com.hr.framework.po.employee.base.reports.EmployeeScheduleTemplate;
import com.hr.framework.projections.employees.reports.EmployeeScheduleTemplateProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeeSchedule" , path = "employeeSchedule" , excerptProjection = EmployeeScheduleTemplateProjection.class)
public interface EmployeeScheduleTemplateRepository extends PagingAndSortingRepository<EmployeeScheduleTemplate,Long>{

    List<EmployeeScheduleTemplate> findById(Long id);

}
