package com.hr.framework.repo;


import com.hr.framework.po.business.crm.orders.ReturnRequestOrders;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "crmReturnRequest" , path = "crmReturnRequest")
public interface CRMReturnRequestOrdersRepository extends PagingAndSortingRepository<ReturnRequestOrders,Long>{

    List<ReturnRequestOrders> findById(Long id);

}
