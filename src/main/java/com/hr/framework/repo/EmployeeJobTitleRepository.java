package com.hr.framework.repo;


import com.hr.framework.po.employee.base.JobTitle;
import com.hr.framework.projections.employees.EmployeeJobTitleProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employeejobtitle" , path = "employeejobtitle" , excerptProjection = EmployeeJobTitleProjection.class)
public interface EmployeeJobTitleRepository extends PagingAndSortingRepository<JobTitle,Long>{

    List<JobTitle> findById(Long id);

}
