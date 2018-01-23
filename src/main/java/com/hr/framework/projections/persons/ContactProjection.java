package com.hr.framework.projections.persons;


import com.hr.framework.po.person.Contact;
import com.hr.framework.po.person.Person;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "contactPersonProjection" , types = {Contact.class})
public interface ContactProjection {

    Long getId();


    Person getPersons();


    String getEmail();


    String getAlternativeEmail();


    String getMobile();


    String getPhone();

}
