package com.hr.framework.projections.persons;


import com.hr.framework.po.person.CountryCode;
import com.hr.framework.po.person.Passport;
import com.hr.framework.po.person.Person;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name  = "personPassportProjection" , types = {Passport.class})
public interface PersonPassportProjection {

    Long getId();


    String getPassportNo();


    String getPassportName();


    Date getFromDate();


    Date getToDate();


    String getIssueBy();


    String getIssueCountry();


    Person getPersons();



    CountryCode getCodes();

}
