package com.hr.framework.repo;


import com.hr.framework.po.business.crm.opportunities.Opportunities;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "opportunities" , path = "opportunities")
public interface CRMOpportunitiesRepository extends PagingAndSortingRepository<Opportunities,Long>{

   List<Opportunities> findById(Long id);

}
