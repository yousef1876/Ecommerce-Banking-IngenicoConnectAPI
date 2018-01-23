package com.hr.framework.repo;

import com.hr.framework.po.bug.tracking.users.TaskStatus;
import com.hr.framework.projections.bugs.TasksStatusProjections;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "tasksstatus" , path = "tasksstatus" , excerptProjection = TasksStatusProjections.class)
public interface TasksStatusRepository extends PagingAndSortingRepository<TaskStatus,Long>{


    List<TaskStatus> findById(Long id);

}
