package com.hr.framework.repo;


import com.hr.framework.po.employee.base.Bonus;
import com.hr.framework.projections.employees.BonusProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel =  "bonus" , path = "bonus" , excerptProjection = BonusProjection.class)
public interface BonusRepository extends PagingAndSortingRepository<Bonus,Long>{

    List<Bonus> findById(Long id);

}
