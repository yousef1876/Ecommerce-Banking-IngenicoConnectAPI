package com.hr.framework.projections.persons;


import com.hr.framework.po.person.Employer;
import com.hr.framework.po.person.Job;
import org.springframework.data.rest.core.config.Projection;

@Projection(name  = "jobProjection" , types = {Job.class})
public interface JobProjection {

    Long getId();

    String getEmployeed();


    String getContactEmail();



    String getAddrs();


    String getMobile();


    String getPhone();


    Employer getJobs();

}
