package com.hr.framework.po.address;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.applicant.Applicant;
import com.hr.framework.po.applicant.ApplicantQualification;
import com.hr.framework.po.applicant.Interviews;
import com.hr.framework.po.applicant.Positions;
import com.hr.framework.po.business.crm.products.Quotes;
import com.hr.framework.po.business.customers.CustomerAddress;
import com.hr.framework.po.business.customers.Customers;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.person.CountryCode;
import com.hr.framework.po.person.Person;
import com.hr.framework.po.store.Customer;
import com.hr.framework.po.store.StoreAddress;
import com.hr.framework.po.store.StoreStreetAddress;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "country")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Country  extends Auditable<Country>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "country_name" , nullable = false)
	private String countryName;
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	@Column(name = "note" , nullable = true)
	private String note;
	
	@OneToMany(fetch  = FetchType.LAZY , mappedBy = "countries")
	private List<State> states;

	@OneToMany(fetch  = FetchType.LAZY , mappedBy = "countries")
	private List<City> cities;

	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY , mappedBy = "country")
	private List<ApplicantQualification> applicantQualificationList;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "country" , cascade = CascadeType.ALL)
	private List<Applicant> applicant;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "country")
	private List<Interviews> interviews;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "country")
	private List<Positions> positions;


	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "country")
	private List<Employee> employees;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "country")
	private List<Customers> customers = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "country")
	private List<Quotes> quotes = new ArrayList<>();


	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "country")
	private List<Customer> customerList = new ArrayList<>();


	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "country")
	private List<StoreAddress> storeAddressList = new ArrayList<>();


	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "country")
	private List<StoreStreetAddress> streetAddresses = new ArrayList<>();
	
	
	@OneToMany(fetch  =  FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "country")
	private List<CountryCode> countryCodes = new ArrayList<>();
	
	
}
