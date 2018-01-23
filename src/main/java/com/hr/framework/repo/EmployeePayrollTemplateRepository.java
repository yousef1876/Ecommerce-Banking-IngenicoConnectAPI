package com.hr.framework.repo;


import com.hr.framework.po.employee.base.reports.PayrollTemplate;
import com.hr.framework.projections.employees.EmployeePayrollProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeepayrolltemplate" , path = "employeepayrolltemplate" , excerptProjection = EmployeePayrollProjection.class)
public interface EmployeePayrollTemplateRepository extends PagingAndSortingRepository<PayrollTemplate,Long>{

    List<PayrollTemplate> findById(Long id);

}
