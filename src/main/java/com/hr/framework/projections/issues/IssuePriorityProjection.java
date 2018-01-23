package com.hr.framework.projections.issues;


import com.hr.framework.po.issue.tracking.users.IssuePriority;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "issuePriorityProjection" , types = {IssuePriority.class})
public interface IssuePriorityProjection {

    Long id();

    String getCode();

    String getRank();





}
