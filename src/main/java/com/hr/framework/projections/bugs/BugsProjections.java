package com.hr.framework.projections.bugs;

import com.hr.framework.po.bug.tracking.users.Bugs;
import com.hr.framework.po.employee.base.Employee;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "bugsProjections" , types = {Bugs.class})
public interface BugsProjections {

    String getBugName();

    String getBugTitle();


    Date getAddedDate();

    Employee getAmployees();


    Employee getModifyBugs();


    Long getId();

}
