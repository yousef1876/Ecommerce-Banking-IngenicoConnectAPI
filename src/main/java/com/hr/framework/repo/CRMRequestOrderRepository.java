package com.hr.framework.repo;


import com.hr.framework.po.business.crm.orders.RequestOrders;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "crmRequestOrders" , path = "crmRequestOrders")
public interface CRMRequestOrderRepository extends PagingAndSortingRepository<RequestOrders,Long>{

    List<RequestOrders> findById(Long id);

}
