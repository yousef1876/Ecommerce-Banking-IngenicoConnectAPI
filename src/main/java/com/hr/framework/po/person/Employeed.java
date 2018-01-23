package com.hr.framework.po.person;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.enums.JobType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

@Entity
@Table(name = "person_employed")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Employeed extends Auditable<Employeed>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	/*Person FK*/
	
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "person_id" , nullable = false)
	private Person persons;
	
	
	/*Employer FK*/
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "employer_id" , nullable = false)
	private Employer employers;
	
	
	
	private boolean present = true;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "employeeds")
    private List<PersonExperience> employeeds;


	@Column(name  = "note" , nullable = true)
	private String note;

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name = "comments" , nullable = true)
	private String comments;



	

}
