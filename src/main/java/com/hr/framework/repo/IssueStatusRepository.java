package com.hr.framework.repo;

import com.hr.framework.po.issue.tracking.users.IssueStatus;
import com.hr.framework.projections.issues.IssueStatusProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "issueStatus" , path = "issueStatus" , excerptProjection = IssueStatusProjection.class)
public interface IssueStatusRepository extends PagingAndSortingRepository<IssueStatus,Long>{

    List<IssueStatus> findById(Long id);
}
