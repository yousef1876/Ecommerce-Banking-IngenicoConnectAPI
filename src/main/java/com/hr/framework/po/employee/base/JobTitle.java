package com.hr.framework.po.employee.base;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name  = "employee_job_title")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class JobTitle extends Auditable<JobTitle>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;


	@Column(name  = "job_name" , nullable = false)
	private String jobName;

	@Column(name  = "note" , nullable = true)
	private String note;

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name  = "job_code" , nullable = false)
	private String jobCode;


	@Column(name  = "created_date" , nullable = false)
	private Date createdDate;


	@ManyToOne
	@JoinColumn(name  = "supervisor" , nullable = false)
	private Employee supervisors;

	@ManyToOne
	@JoinColumn(name  = "employeee_id" , nullable = false)
	private Employee employees;





}
