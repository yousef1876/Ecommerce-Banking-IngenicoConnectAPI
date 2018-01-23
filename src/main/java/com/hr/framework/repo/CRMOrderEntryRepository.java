package com.hr.framework.repo;


import com.hr.framework.po.business.crm.orders.OrderEntry;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "orderEntry" , path = "orderEntry")
public interface CRMOrderEntryRepository  extends PagingAndSortingRepository<OrderEntry,Long> {

    List<OrderEntry> findById(Long id);


}
