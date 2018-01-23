package com.hr.framework.projections.persons;


import com.hr.framework.po.person.Employer;
import com.hr.framework.po.person.Person;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "employerProjection" , types = {Employer.class})
public interface EmployerProjection {

    Long getId();


    String getEmployerName();

    String getAddress();


    String getEmployerCode();


    String getEmail();


    String getHeadAddName();


    Employer getParent();


    Person getPersons();



}
