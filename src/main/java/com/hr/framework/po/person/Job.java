package com.hr.framework.po.person;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table( name = "jobs")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Job extends Auditable<Job>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	
	@Column(name = "job_title" , nullable = false)
	private String jobTitle;
	
	@Column(name = "company" , nullable = false)
	private String employeed;
	
	@Column(name = "contact_email" , nullable = false)
	private String contactEmail;
	
	@Column(name = "addrs" , nullable = false)
	private String addrs;
	
	@Column(name = "mobile" , nullable = false)
	private String mobile;
	
	@Column(name = "phone" , nullable = false)
	private String phone;
	
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	@Column(name = "note" , nullable = true)
	private String note;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employer_id" , nullable = true)
	private Employer jobs;

	
}
