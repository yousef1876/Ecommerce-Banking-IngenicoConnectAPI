package com.hr.framework.po.person;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "person_experience")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class PersonExperience extends Auditable<PersonExperience> {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "from_date" , nullable = false)
	private Date fromDate;
	
	@Column(name = "to_date" , nullable = false)
	private Date toDate;
	
	@Column(name = "is_present" , nullable = true)
	private boolean ispresent;
	
    @Column(name = "duties" , nullable = false)
	private String duties;
	
    @Column(name = "description" , nullable = true)
	private String description;
	
    @Column(name = "note" , nullable = true)
	private String note;
	
	@Column(name = "leave_reason" , nullable = true)
    private String leaveReason;
    
	@Column(name = "weakness" , nullable = true)
    private String weakness;
    
	@Column(name = "strongness" , nullable = true)
    private String strongness;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "employeed_id" , nullable = false)
	private Employeed employeeds;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "person_id" , nullable = false)
	private Person persons;



}
