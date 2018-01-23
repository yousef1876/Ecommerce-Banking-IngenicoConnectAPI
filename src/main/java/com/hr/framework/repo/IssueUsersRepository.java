package com.hr.framework.repo;

import com.hr.framework.po.issue.tracking.users.Users;
import com.hr.framework.projections.issues.IssueUsers;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "issueUsers" , path = "issueUsers" , excerptProjection = IssueUsers.class)
public interface IssueUsersRepository extends PagingAndSortingRepository<Users,Long>{
}
