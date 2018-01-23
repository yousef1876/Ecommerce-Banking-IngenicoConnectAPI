package com.hr.framework.projections.applicant;

import com.hr.framework.po.address.Country;
import com.hr.framework.po.applicant.Applicant;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "applicantProjection" , types = {Applicant.class})
public interface ApplicantProjection {

    String getFirstName();

    String getSecondName();

    String getLastName();

    String getIdNo();

    String getPassportNo();

    Country getCountry();

    String getMobile();

    String getPhone();

    String getLogin();

    Long getId();

}
