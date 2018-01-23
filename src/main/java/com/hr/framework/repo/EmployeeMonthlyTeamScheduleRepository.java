package com.hr.framework.repo;

import com.hr.framework.po.employee.base.reports.MonthlyTeamWorkSchedule;
import com.hr.framework.projections.employees.reports.EmployeeMonthlyTeamWorkScheduleProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeeteamschedule" , path = "employeeteamchedule" , excerptProjection = EmployeeMonthlyTeamWorkScheduleProjection.class)
public interface EmployeeMonthlyTeamScheduleRepository extends PagingAndSortingRepository<MonthlyTeamWorkSchedule,Long>{

    List<MonthlyTeamWorkSchedule> findById(Long id);


}
