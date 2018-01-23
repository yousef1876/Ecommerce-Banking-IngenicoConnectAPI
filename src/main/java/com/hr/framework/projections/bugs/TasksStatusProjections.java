package com.hr.framework.projections.bugs;

import com.hr.framework.po.bug.tracking.users.TaskStatus;
import com.hr.framework.po.bug.tracking.users.Tasks;
import com.hr.framework.po.bug.tracking.users.Users;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "tasksstatus" , types = {TaskStatus.class})
public interface TasksStatusProjections {

    Tasks getTasks();

    Date getAddedDate();

    Users getUsers();

    Long getId();
}
