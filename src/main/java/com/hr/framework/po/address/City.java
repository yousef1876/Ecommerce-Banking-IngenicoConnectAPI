package com.hr.framework.po.address;

import com.hr.framework.annotation.SizeField;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.applicant.Applicant;
import com.hr.framework.po.applicant.ApplicantQualification;
import com.hr.framework.po.applicant.Interviews;
import com.hr.framework.po.applicant.Positions;
import com.hr.framework.po.business.crm.products.Quotes;
import com.hr.framework.po.business.customers.Customers;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.employee.base.reports.PayrollTemplate;
import com.hr.framework.po.store.Customer;
import com.hr.framework.po.store.StoreAddress;
import com.hr.framework.po.store.StoreStreetAddress;
import lombok.Data;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "city")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class City extends Auditable<City>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	/*Country FK*/
	
	@ManyToOne(fetch  = FetchType.LAZY)
	@JoinColumn(name = "country_id" , nullable = false)
	private Country countries;
	
	/*State FK*/
	@ManyToOne(fetch  = FetchType.LAZY)
	@JoinColumn(name = "state_id" , nullable = true)
	private State states;
	
	
	@Column(name = "city" , nullable = false)
	private String city;
	
	@Column(name  = "code" , nullable = true)
	private String code;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "city" , cascade = CascadeType.ALL)
	private List<ApplicantQualification> applicantQualificationList;


	@OneToMany(fetch = FetchType.LAZY , mappedBy = "city" , cascade = CascadeType.ALL)
	private List<Applicant> applicant;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "city")
	private List<Interviews> interviews;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "city")
	private List<Positions> positions;


	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "city")
	private List<Employee> employees;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "city")
    private List<Customers> customers = new ArrayList<>();	
	
	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "city")
	private List<Quotes> quotes = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "cities")
	private List<Customer> customersStore = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "city")
	private List<StoreAddress> storeAddressList = new ArrayList<>();


	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "city")
	private List<StoreStreetAddress> streetAddresses = new ArrayList<>();
	
	
	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "city")
	private List<PayrollTemplate>  payrollTemplates = new ArrayList<>();
	
	
}
