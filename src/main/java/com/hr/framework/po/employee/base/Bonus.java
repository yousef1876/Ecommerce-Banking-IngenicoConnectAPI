package com.hr.framework.po.employee.base;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name  = "employee_bonus")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Bonus extends Auditable<Bonus> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "bouns" , nullable = false)
	private String bouns;

	@Column(name = "created_date" , nullable = false)
	private Date createdDate;
	
    /*Employee FK*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id" , nullable = false)
	private Employee employees;
	
	

	
	
	@Column(name  = "description" , nullable = true )
	private String description;

	@Column(name = "note" , nullable = true)
	private String note;

	@Column(name  = "started_month" , nullable = false)
	private Date startedMonth;


}
