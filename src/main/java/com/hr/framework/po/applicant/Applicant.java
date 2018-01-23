package com.hr.framework.po.applicant;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.address.City;
import com.hr.framework.po.address.Country;
import com.hr.framework.po.address.State;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name  = "applicant")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Applicant extends Auditable<Applicant>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name  = "first_name" , nullable = false)
    private String firstName;

    @Column(name  = "second_name" , nullable = false)
    private String secondName;

    @Column(name  = "last_name" , nullable = false)
    private String lastName;

    @Column(name  = "initial" , nullable = false)
    private String initial;

    @Column(name  = "id_no" , nullable = false)
    private String idNo;

    @Column(name  = "passport" , nullable = true)
    private String passportNo;

    @ManyToOne()
    @JoinColumn(name = "city_id" , nullable = true)
    private City city;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "country_id" , nullable = false)
    private Country country;

    @ManyToOne
    @JoinColumn(name = "state_id" , nullable = true)
    private State state;

    @Column(name = "mobile" , nullable = false)
    private String mobile;

    @Column(name  = "phone" , nullable = true)
    private String phone;

    @Column(name = "login" , nullable = false)
    private String login;

    @Column(name = "password" , nullable = false)
    private String password;

    @Column(name = "is_active" , nullable = false)
    private boolean isactive;

    @Column(name  = "is_blocked" , nullable = true)
    private boolean isblock;




    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "applicant")
    private List<ApplicantAttachment> applicantAttachmentList;


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "applicant")
    private List<ApplicantExperience>  applicantExperienceList;


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "applicant")
    private List<ApplicantQualification>  applicantQualificationList;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "applicant")
    private List<ApplicantSkills>  applicantSkillsList;


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "applicant")
    private List<Interviews> interviews;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSecondName() {
		return secondName;
	}


	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getInitial() {
		return initial;
	}


	public void setInitial(String initial) {
		this.initial = initial;
	}


	public String getIdNo() {
		return idNo;
	}


	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}


	public String getPassportNo() {
		return passportNo;
	}


	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
		this.country = country;
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isIsactive() {
		return isactive;
	}


	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}


	public boolean isIsblock() {
		return isblock;
	}


	public void setIsblock(boolean isblock) {
		this.isblock = isblock;
	}


	public List<ApplicantAttachment> getApplicantAttachmentList() {
		return applicantAttachmentList;
	}


	public void setApplicantAttachmentList(List<ApplicantAttachment> applicantAttachmentList) {
		this.applicantAttachmentList = applicantAttachmentList;
	}


	public List<ApplicantExperience> getApplicantExperienceList() {
		return applicantExperienceList;
	}


	public void setApplicantExperienceList(List<ApplicantExperience> applicantExperienceList) {
		this.applicantExperienceList = applicantExperienceList;
	}


	public List<ApplicantQualification> getApplicantQualificationList() {
		return applicantQualificationList;
	}


	public void setApplicantQualificationList(List<ApplicantQualification> applicantQualificationList) {
		this.applicantQualificationList = applicantQualificationList;
	}


	public List<ApplicantSkills> getApplicantSkillsList() {
		return applicantSkillsList;
	}


	public void setApplicantSkillsList(List<ApplicantSkills> applicantSkillsList) {
		this.applicantSkillsList = applicantSkillsList;
	}


	public List<Interviews> getInterviews() {
		return interviews;
	}


	public void setInterviews(List<Interviews> interviews) {
		this.interviews = interviews;
	}





}
