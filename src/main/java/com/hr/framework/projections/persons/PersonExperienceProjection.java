package com.hr.framework.projections.persons;


import com.hr.framework.po.person.Employeed;
import com.hr.framework.po.person.Person;
import com.hr.framework.po.person.PersonExperience;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "personExperienceProjection" , types = {PersonExperience.class})
public interface PersonExperienceProjection {

    Long getId();


    Date getFromDate();


    Date getToDate();


    boolean getIspresent();


    String getLeaveReason();


    String getWeakness();


    String getStrongness();



    Person getPersons();


    Employeed getEmployeeds();

}
