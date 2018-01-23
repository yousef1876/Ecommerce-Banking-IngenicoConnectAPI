package com.hr.framework.po.person;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table( name = "citizen")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Citizen extends Auditable<Citizen> {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	/* person  FK*/
    /* Country FK*/
	
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "person_id" , nullable = false)
	private Person persons;
	
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "country_id" , nullable = false)
	private CountryCode codes;
	
	
	@Column(name = "citizen_name" , nullable = false)
	private String citizenName;
	
	@Column(name = "citizen_type" , nullable = false)
	private String citizenType;
	
	@Column(name = "citizen_no" , nullable = false)
	private String citizenNo;
	
	@Column(name = "from_date" , nullable = false)
	private Date fromDate;
	
	@Column(name= "to_date" , nullable = true)
	private Date toDate;
	
	@Column(name = "note" , nullable = true)
	private String note;
	
	@Column(name = "description" , nullable = true)
	private String description;


	
}
