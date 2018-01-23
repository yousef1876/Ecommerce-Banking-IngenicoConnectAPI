package com.hr.framework.po.person;

import javax.persistence.*;

import com.enums.MaritalStatusType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "marital_status")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class MaritalStatus extends Auditable<MaritalStatus>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	
	@Column(name = "from_date" , nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fromDate;
	
	@Column(name = "end_date" , nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@Column(name = "status" , nullable = false)
	private MaritalStatusType status;

	@OneToOne(fetch = FetchType.LAZY , mappedBy = "status")
	@JoinColumn(name  = "person_id" , nullable = false)
	private Person persons;
	
	

	

}
