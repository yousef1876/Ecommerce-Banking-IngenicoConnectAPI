package com.hr.framework.po.person;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name  = "employer")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Employer extends Auditable<Employer>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "employer_name" , nullable = false)
	private String employerName;
	
	@Column(name = "address" , nullable = false)
	private String address;
	
	@Column(name = "employer_code" , nullable = false)
	private String employerCode;
	
	@Column(name = "email" , nullable = false)
	private String email;
	
	@Column(name = "head_addrs_name" , nullable = false)
	private String headAddName;
	
	@Column(name = "head_phone" )
	private String headphone;

	/*Jobs FK*/
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "jobs")
	private List<Job> jobs;
	

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id" , nullable = false)
	private Employer parent;

	
    
	/* PersonName; FK */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "person_id" , nullable = false)
	private Person persons;




}
