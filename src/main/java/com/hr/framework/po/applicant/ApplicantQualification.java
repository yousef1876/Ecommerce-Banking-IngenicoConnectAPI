package com.hr.framework.po.applicant;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.address.City;
import com.hr.framework.po.address.Country;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  = "applicant_qualification")
@EntityListeners(EntityListener.class)
@Data
@Cacheable(true)
public class ApplicantQualification extends Auditable<ApplicantQualification>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "university_name" , nullable = false)
    private String universityName;

    @Column(name  = "faculty" , nullable = false)
    private String faculty;

    @Column(name = "major" , nullable = false)
    private String major;

    @Column(name  = "gpa" , nullable = false)
    private String GPA;

    @Column(name  = "start_date" , nullable = false)
    private Date startDate;

    @Column(name  = "end_date" , nullable = false)
    private Date endDate;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "note" , nullable = true)
    private String note;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id" , nullable = false)
    private City city;

    @ManyToOne
    @JoinColumn(name  = "country_id" , nullable = false)
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "applicant_id" , nullable = false)
    private Applicant applicant;

}
