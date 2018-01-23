package com.hr.framework.projections.adresses;

import com.hr.framework.po.address.City;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlineAddress", types = { City.class })
public interface CityProjection {

     String getCity();

     String getCode();

     String getCountries();

     Long getId();

}
