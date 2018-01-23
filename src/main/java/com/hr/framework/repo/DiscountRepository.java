package com.hr.framework.repo;


import com.hr.framework.po.employee.base.Discount;
import com.hr.framework.projections.employees.DiscountProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "discount" , path = "discount" , excerptProjection = DiscountProjection.class)
public interface DiscountRepository extends PagingAndSortingRepository<Discount,Long>{

       List<Discount> findById(Long id);

}
