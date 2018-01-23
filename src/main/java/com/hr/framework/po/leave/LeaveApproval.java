package com.hr.framework.po.leave;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.person.Person;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "leave_approval")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class LeaveApproval extends Auditable<LeaveApproval>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	private boolean isFullyApproved;
	
	/*person FK*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "person_id" , nullable =  true)
	private Person persons;


	/*Leave FK*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "leave_id" , nullable = false)
	private Leave leaves;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "employee_id" , nullable = true)
	private Employee employees;

}
