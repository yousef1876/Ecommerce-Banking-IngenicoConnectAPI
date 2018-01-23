package com.hr.framework.repo;


import com.hr.framework.po.issue.tracking.users.Project;
import com.hr.framework.projections.issues.ProjectProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "projectIssue" , path = "projectIssue" , excerptProjection = ProjectProjection.class)
public interface ProjectIssueRepository extends PagingAndSortingRepository<Project,Long>{

    List<Project> findById(Long id);

}
