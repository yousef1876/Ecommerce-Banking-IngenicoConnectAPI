package com.hr.framework.projections.persons;

import com.hr.framework.po.address.Country;
import com.hr.framework.po.person.CountryCode;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "countryCodeProjection" , types = {CountryCode.class})
public interface CountryCodeProjection {

    Long getId();


    String getCountryCode();


    String getCountryName();


    Country getCountry();



}
