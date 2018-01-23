package com.hr.framework.repo;

import com.hr.framework.po.business.crm.orders.OrderEntry;
import com.hr.framework.po.business.crm.orders.Orders;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "orders" , path = "orders")
public interface CRMOrderReposirory extends PagingAndSortingRepository<OrderEntry,Long>{

    List<Orders> findById(Long id);

}
