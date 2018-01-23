package com.hr.framework.po.person;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "contact")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Contact extends Auditable<Contact> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	/*Person FK*/
	
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "person_id" , nullable = false)
	private Person persons;
	
	@Column(name = "email" , nullable = false)
	private String email;
	
	@Column(name = "alternative_email" , nullable = true)
	private String alternativeEmail;
	
	@Column(name = "mobile" , nullable = false)
	private String mobile;
	
	@Column(name = "phone" , nullable = false)
	private String phone;
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	@Column(name = "note" , nullable = true)
	private String notes;


	
}
