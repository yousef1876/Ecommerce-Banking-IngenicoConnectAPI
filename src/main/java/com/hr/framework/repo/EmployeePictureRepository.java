package com.hr.framework.repo;


import com.hr.framework.po.employee.base.EmployeePicture;
import com.hr.framework.projections.employees.EmployeePictureProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel  = "employeepicture" , path= "employeepicture" , excerptProjection = EmployeePictureProjection.class)
public interface EmployeePictureRepository extends PagingAndSortingRepository<EmployeePicture,Long>{


    List<EmployeePicture> findById(Long id);


}
