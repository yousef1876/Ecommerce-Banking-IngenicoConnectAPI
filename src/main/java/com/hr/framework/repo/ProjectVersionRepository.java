package com.hr.framework.repo;

import com.hr.framework.po.bug.tracking.users.ProjectVersion;
import com.hr.framework.projections.bugs.ProjectVersionProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "pversions" , path = "pversions" , excerptProjection = ProjectVersionProjection.class)
public interface ProjectVersionRepository  extends PagingAndSortingRepository<ProjectVersion,Long>{


    List<ProjectVersion> findById(Long id);

}
