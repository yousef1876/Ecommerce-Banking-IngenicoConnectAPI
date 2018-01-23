package com.hr.framework.repo;

import com.hr.framework.po.bug.tracking.users.Project;
import com.hr.framework.projections.bugs.ProjectInfoProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "projects" , path="projects" , excerptProjection = ProjectInfoProjection.class)
public interface ProjectRepository extends PagingAndSortingRepository<Project,Long>{

    List<Project> findById(Long id);


}
