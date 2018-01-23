package com.hr.framework.projections.bugs;

import com.hr.framework.po.bug.tracking.users.Users;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "usersProjections" , types = {Users.class})
public interface UsersProjections {

    String getUsername();

    String getPassword();

    String getFirstName();

    String getSecondName();

    String getLastName();

    boolean isActive();

    Long getId();

}
