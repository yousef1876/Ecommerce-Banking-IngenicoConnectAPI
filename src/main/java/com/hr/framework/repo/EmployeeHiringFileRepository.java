package com.hr.framework.repo;

import com.hr.framework.po.employee.base.reports.HiringFiles;
import com.hr.framework.projections.employees.reports.EmployeeHiringFilesProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "hiringfiles" , path = "hiringfiles" , excerptProjection = EmployeeHiringFilesProjection.class)
public interface EmployeeHiringFileRepository extends PagingAndSortingRepository<HiringFiles,Long>{

    List<HiringFiles> findById(Long id);



}
