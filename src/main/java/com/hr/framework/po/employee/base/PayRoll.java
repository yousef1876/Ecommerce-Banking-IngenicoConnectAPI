package com.hr.framework.po.employee.base;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "employee_pay_roll")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class PayRoll extends Auditable<PayRoll>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	/* Employee FK*/

	@Column(name  = "started_day" , nullable = false)
	private Date beginDay;

	@Column(name  = "ended_day" , nullable = false)
	private Date endedDay;

	@Column(name  = "hour_worked" , nullable = false)
	private String hourWorked;

	@Column(name  = "discount" , nullable = false)
	private String discount;

	@ManyToOne
	@JoinColumn(name  = "employee_id" , nullable = false)
	private Employee employees;


}
