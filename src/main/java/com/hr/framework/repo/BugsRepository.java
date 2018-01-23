package com.hr.framework.repo;

import com.hr.framework.po.bug.tracking.users.Bugs;
import com.hr.framework.projections.bugs.BugsProjections;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "bugsRepository" , path = "bugs" , excerptProjection = BugsProjections.class)
public interface BugsRepository extends PagingAndSortingRepository<Bugs,Long>{

    List<Bugs> findById(Long id);

}
