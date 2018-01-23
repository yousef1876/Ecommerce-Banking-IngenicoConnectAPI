package com.hr.framework.po.transaction.logger;

import lombok.Data;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name  = "session")
@Data
@Cacheable(true)
public class Session {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "session_id", updatable = false, nullable = false)
	private String id;
	
	@Column(name  = "session_created_date" , nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date sessionCreatedDate;
	
	@Column(name  = "session_name" , nullable = false)
	private String name;
	
	@Column(name = "session_title" , nullable = false)
	private String sessionTitle;
	

	
}
