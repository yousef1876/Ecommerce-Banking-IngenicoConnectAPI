package com.hr.framework.projections.persons;


import com.hr.framework.po.person.LanguageCode;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "languageCodeProjection" , types = {LanguageCode.class})
public interface LanguageCodeProjection {

    Long getId();


    String getLangCode();


    String getLangName();

}
