package com.hr.framework.repo;

import com.hr.framework.po.employee.base.Department;
import com.hr.framework.projections.employees.DepartmentProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "department" , path = "department" , excerptProjection = DepartmentProjection.class)
public interface DepartmentRepository extends PagingAndSortingRepository<Department,Long>{

   Department findById(Long id);

}
