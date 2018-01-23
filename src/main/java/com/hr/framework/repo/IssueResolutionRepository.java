package com.hr.framework.repo;


import com.hr.framework.po.issue.tracking.users.Resolution;
import com.hr.framework.projections.issues.IssueResolutionProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "issueResolution" , path = "issueResolution" , excerptProjection = IssueResolutionProjection.class)
public interface IssueResolutionRepository extends PagingAndSortingRepository<Resolution,Long>{
}
