package com.hr.framework.projections.bugs;

import com.hr.framework.po.bug.tracking.users.Groups;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "groupProjection" , types = {Groups.class})
public interface GrouppProjection {

    String getGroupName();

    boolean isActive();


    Long getId();

}
