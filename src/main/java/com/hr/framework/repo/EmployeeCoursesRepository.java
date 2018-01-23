package com.hr.framework.repo;

import com.hr.framework.po.employee.performance.EmployeeCourses;
import com.hr.framework.projections.employees.performance.EmployeeCoursesProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel =  "employeecourses" , path = "employeecourses" , excerptProjection = EmployeeCoursesProjection.class)
public interface EmployeeCoursesRepository extends PagingAndSortingRepository<EmployeeCourses,Long>{

    List<EmployeeCourses> findById(Long id);

}
