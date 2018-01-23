package com.hr.framework.repo;


import com.hr.framework.po.issue.tracking.users.Severity;
import com.hr.framework.projections.issues.IssueServerityProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "issueServer" , path = "issueServer" , excerptProjection = IssueServerityProjection.class)
public interface IssueServerityRepository extends PagingAndSortingRepository<Severity,Long>{


}
