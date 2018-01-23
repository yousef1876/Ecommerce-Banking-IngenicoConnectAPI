package com.hr.framework.po.employee.base;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "employee_type")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class EmployeeType extends Auditable<EmployeeType>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name  = "type" , nullable = false)
	private String type;

	@Column(name  = "note" , nullable = true)
	private String note;

	@Column(name  = "description" , nullable = true)
	private String description;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "employee_id" , nullable = false)
	private Employee employees;


}
