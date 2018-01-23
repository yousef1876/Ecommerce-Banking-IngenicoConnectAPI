package com.hr.framework.projections.persons;


import com.hr.framework.po.person.CountryCode;
import com.hr.framework.po.person.LanguageCode;
import com.hr.framework.po.person.PersonLanguage;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "personLanguageCode" , types = {PersonLanguage.class})
public interface PersonLanguageProjection {

    Long getId();


    LanguageCode getCode();


    CountryCode getCodes();

}
