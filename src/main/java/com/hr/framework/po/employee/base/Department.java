package com.hr.framework.po.employee.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.enums.DepartmentCategory;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.agreements.AgreementRoleType;
import com.hr.framework.po.business.crm.leads.Leads;
import com.hr.framework.po.business.crm.meeting.Role;
import com.hr.framework.po.employee.performance.EmployeeCourses;
import com.hr.framework.po.employee.performance.PerformanceReview;
import lombok.Data;

@Entity
@Table(name  = "employee_department")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Department extends Auditable<Department>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "dept_name" , nullable = false)
	private String deptName;

	@Column(name  = "dept_category" , nullable = false)
	private DepartmentCategory catogery;

	@Column(name  = "created_date" , nullable = false)
	private Date createdDate;

	@Column(name  = "updated_date" , nullable = true)
	private Date updatedDate;

	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name = "dept_id")
	private Department parent; /* FK */

	@OneToMany(fetch = FetchType.LAZY ,  mappedBy = "depts" , cascade = CascadeType.ALL)
	private List<Employee> employees;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "departments")
	private List<EmployeeCourses> courses;


	@OneToMany(mappedBy = "depts" , fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private List<PerformanceReview> performances;


	@Column(name  = "description")
	private String description;


	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "departments")
	private List<AgreementRoleType> agreementRoleTypes = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "dept")
	private List<Leads> leads = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "departments")
	private List<Role> roles = new ArrayList<>();
	
}
