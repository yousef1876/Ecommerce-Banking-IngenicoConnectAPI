package com.hr.framework.repo;

import com.hr.framework.po.business.crm.orders.OrderRequirements;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "orderRequirements" , path = "orderRequirements")
public interface CRMOrderRequirementsRepository extends PagingAndSortingRepository<OrderRequirements,Long>{

    List<OrderRequirements> findById(Long id);
}
