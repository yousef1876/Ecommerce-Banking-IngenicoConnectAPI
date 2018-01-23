package com.hr.framework.repo;


import com.hr.framework.po.issue.tracking.users.IssueComment;
import com.hr.framework.projections.issues.IssueCommentsProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "issueComments" , path = "issueComments" , excerptProjection = IssueCommentsProjection.class)
public interface IssueCommentsRepository extends PagingAndSortingRepository<IssueComment,Long>{

    List<IssueComment> findById(Long id);

}
