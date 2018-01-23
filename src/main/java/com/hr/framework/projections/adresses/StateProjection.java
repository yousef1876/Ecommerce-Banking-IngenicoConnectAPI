package com.hr.framework.projections.adresses;

import com.hr.framework.po.address.Country;
import com.hr.framework.po.address.State;
import org.springframework.data.rest.core.config.Projection;

@Projection(name   = "inLineAddressState" , types = {State.class})
public interface StateProjection {

   Country getCountries();

   Long getId();

   String getState();

   String getStateCode();

}
