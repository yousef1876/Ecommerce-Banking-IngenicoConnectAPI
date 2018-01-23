package com.hr.framework.projections.persons;


import com.enums.MaritalStatusType;
import com.hr.framework.po.person.MaritalStatus;
import com.hr.framework.po.person.Person;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "maritalStatusPersonProjection" , types = {MaritalStatus.class})
public interface MaritalStatusPersonProjection {

    Long getId();


    Date getFromDate();


    Date getEndDate();


    MaritalStatusType getStatus();


    Person getPersons();

}
