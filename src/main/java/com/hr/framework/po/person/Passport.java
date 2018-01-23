package com.hr.framework.po.person;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "passport")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Passport extends Auditable<Passport>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "passport_no" , nullable = false)
	private String passportNo;
	
	@Column(name = "passport_name" , nullable = false)
	private String passportName;
	
	@Column(name = "from_date" , nullable = false)
	private Date fromDate;
	
	@Column(name = "to_date" , nullable = false)
	private Date toDate;
	
	@Column(name = "issue_by" , nullable = false)
	private String issueBy;
	
	@Column(name = "issue_country" , nullable = false)
	private String issueCountry;

	/*Person FK*/
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "person_id" , nullable = false)
	private Person persons;
	
	/*Country FK*/
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "country_id" , nullable = true)
	private CountryCode codes;
	

	
}
