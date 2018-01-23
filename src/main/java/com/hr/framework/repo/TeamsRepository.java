package com.hr.framework.repo;

import com.hr.framework.po.bug.tracking.users.Teams;
import com.hr.framework.projections.bugs.TeamsProjections;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "teams" , path = "teams" , excerptProjection = TeamsProjections.class)
public interface TeamsRepository extends PagingAndSortingRepository<Teams,Long>{

    List<Teams> findById(Long id);

}
