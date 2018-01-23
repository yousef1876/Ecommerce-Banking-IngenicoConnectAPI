package com.hr.framework.projections.issues;


import com.hr.framework.po.issue.tracking.users.Users;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "issueUsersProjection" , types = {Users.class})
public interface IssueUsers {

    Long getId();


    String getFirstName();


    String getSecondName();


    String getLastName();


    String getUserName();


    Date getLastLoginDate();


    String getEmail();


    String getMobile();


    String getPhone();



}
