package com.hr.framework.repo;

import com.hr.framework.po.issue.tracking.users.IssuePriority;
import com.hr.framework.projections.issues.IssuePriorityProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "issuePriority" , path = "issuePriority" , excerptProjection = IssuePriorityProjection.class)
public interface IssuePriorityRepository extends PagingAndSortingRepository<IssuePriority,Long>{

    List<IssuePriority> findById(Long id);
}
