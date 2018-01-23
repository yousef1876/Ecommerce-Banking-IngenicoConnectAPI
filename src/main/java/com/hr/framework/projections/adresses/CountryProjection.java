package com.hr.framework.projections.adresses;

import com.hr.framework.po.address.Country;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inLineAddressCountry" , types = {Country.class})
public interface CountryProjection {


    Long getId();

    String getCountryName();

}
