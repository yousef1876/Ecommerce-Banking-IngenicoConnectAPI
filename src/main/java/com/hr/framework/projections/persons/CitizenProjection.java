package com.hr.framework.projections.persons;


import com.hr.framework.po.person.Citizen;
import com.hr.framework.po.person.CountryCode;
import com.hr.framework.po.person.Person;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "citizenProjection" , types = {Citizen.class})
public interface CitizenProjection {

    Long getId();

    Person getPersons();

    CountryCode getCodes();

    String getCitizenName();


    String getCitizenType();


    String getCitizenNo();


    Date getFromDate();


    Date getToDate();

}
