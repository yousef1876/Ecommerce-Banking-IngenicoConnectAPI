package com.hr.framework.po.employee.base;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "employee_hours_rate")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Hourly extends Auditable<Hourly>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	
	/*Employee FK*/
	@ManyToOne
	@JoinColumn(name  = "employee_id" , nullable = false)
	private Employee employees;


	@Column(name  ="rate" , nullable = false)
	private String rate;

	@Column(name = "note" , nullable = true)
	private String note;

	@Column(name  ="description" , nullable = true)
	private String description;


}
