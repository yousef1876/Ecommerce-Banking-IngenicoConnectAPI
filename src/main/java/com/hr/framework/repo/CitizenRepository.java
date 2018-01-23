package com.hr.framework.repo;


import com.hr.framework.po.person.Citizen;
import com.hr.framework.projections.persons.CitizenProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "citizen" , path = "citizen" , excerptProjection = CitizenProjection.class)
public interface CitizenRepository extends PagingAndSortingRepository<Citizen,Long>{

      List<Citizen> findById(Long id);

}
