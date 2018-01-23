package com.hr.framework.projections.persons;


import com.hr.framework.po.person.Person;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "personProjection" , types = {Person.class})
public interface PersonsProjections {

    Long getId();


    String getFirstName();


    String getSecondNameI();


    String getLastName();


    String getBirthName();



    String getBirthPlace();


    String getReligiuosName();


}
