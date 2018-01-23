package com.hr.framework.repo;

import com.hr.framework.po.issue.tracking.users.Issue;
import com.hr.framework.projections.issues.IssueProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "issue" , path = "issue" , excerptProjection = IssueProjection.class)
public interface IssueRepository extends PagingAndSortingRepository<Issue,Long>{

   List<Issue> findById(Long id);

}
