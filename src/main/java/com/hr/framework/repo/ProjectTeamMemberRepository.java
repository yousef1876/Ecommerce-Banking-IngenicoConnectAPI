package com.hr.framework.repo;

import com.hr.framework.po.bug.tracking.users.ProjectTeamMember;
import com.hr.framework.projections.bugs.ProjectTeamMemberProjections;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "teams" , path="teams" , excerptProjection = ProjectTeamMemberProjections.class)
public interface ProjectTeamMemberRepository extends PagingAndSortingRepository<ProjectTeamMember,Long>{

    List<ProjectTeamMember> findById(Long id);
}
