package com.hr.framework.projections.persons;

import com.enums.IdentificationType;
import com.hr.framework.po.person.Identification;
import com.hr.framework.po.person.Person;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "identificationPersonProjection" , types = {Identification.class})
public interface IdentificationPersonProjection {

    Long getId();


    Person getPersons();


    String getNumber();


    Date getIssueDate();


    Date getExpireDate();


    String getIssueBy();


    String getIssuePlace();


    IdentificationType getType();
}
