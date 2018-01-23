package com.hr.framework.projections.persons;


import com.enums.GenderType;
import com.hr.framework.po.person.Gender;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "genderPerson" , types = {Gender.class})
public interface GenderPersonProjection {

    Long getId();


    GenderType getType();

}
