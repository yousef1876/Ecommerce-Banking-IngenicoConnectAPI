package com.hr.framework.repo;

import com.hr.framework.po.bug.tracking.users.Tasks;
import com.hr.framework.projections.bugs.TasksProjections;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "tasks" , path = "tasks" , excerptProjection = TasksProjections.class)
public interface TasksRepository extends PagingAndSortingRepository<Tasks,Long>{

    List<Tasks> findById(Long id);

}
