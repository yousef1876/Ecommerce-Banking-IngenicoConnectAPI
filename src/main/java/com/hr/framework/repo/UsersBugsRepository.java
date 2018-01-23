package com.hr.framework.repo;

import com.hr.framework.po.bug.tracking.users.Users;
import com.hr.framework.projections.bugs.UsersProjections;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "usersbugs" , path = "usersbugs" , excerptProjection = UsersProjections.class)
public interface UsersBugsRepository extends PagingAndSortingRepository<Users,Long> {

     List<Users> findById(Long id);

}
