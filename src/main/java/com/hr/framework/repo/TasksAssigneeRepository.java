package com.hr.framework.repo;

import com.hr.framework.po.bug.tracking.users.TaskAssignee;
import com.hr.framework.projections.bugs.TaskAssigneeProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "tasksassignee" , path = "tasksassignee" , excerptProjection = TaskAssigneeProjection.class)
public interface TasksAssigneeRepository extends PagingAndSortingRepository<TaskAssignee,Long> {

    List<TaskAssignee> findById(Long id);

}
