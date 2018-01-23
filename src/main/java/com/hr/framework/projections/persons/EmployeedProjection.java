package com.hr.framework.projections.persons;

import com.hr.framework.po.person.Employeed;
import com.hr.framework.po.person.Employer;
import com.hr.framework.po.person.Person;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "employeedProjection" , types = {Employeed.class})
public interface EmployeedProjection {

    Long getId();

    Person getPersons();


    Employer getEmployers();


    String getNote();

    String getDescription();

    String getComments();

}
