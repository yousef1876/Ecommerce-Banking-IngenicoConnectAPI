package com.hr.framework.projections.persons;


import com.hr.framework.po.person.Person;
import com.hr.framework.po.person.Skills;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "personSkillsProjection" , types = {Skills.class})
public interface PersonSkillsProjection {

    Long getId();


    String getSkillName();


    Date getFromDate();


    Date getToDate();


    Person getPersons();

}
