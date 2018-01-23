package com.hr.framework.repo;


import com.hr.framework.po.person.DegreeObtained;
import com.hr.framework.projections.persons.DegreeObtainedProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "degreeObtainedPerson" , path = "degreeObtainedPerson" , excerptProjection = DegreeObtainedProjection.class)
public interface DegreeObtainedRepository extends PagingAndSortingRepository<DegreeObtained,Long>{

     List<DegreeObtained> findById(Long id);

}
