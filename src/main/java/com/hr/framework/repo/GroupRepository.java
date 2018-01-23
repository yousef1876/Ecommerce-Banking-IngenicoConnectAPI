package com.hr.framework.repo;

import com.hr.framework.po.bug.tracking.users.Groups;
import com.hr.framework.projections.bugs.GrouppProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "groups" , path = "groups" , excerptProjection = GrouppProjection.class)
public interface GroupRepository extends PagingAndSortingRepository<Groups,Long>{

    List<Groups> findById(Long id);


}
