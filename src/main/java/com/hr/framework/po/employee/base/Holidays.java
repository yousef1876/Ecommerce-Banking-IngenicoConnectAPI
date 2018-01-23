package com.hr.framework.po.employee.base;

import java.util.Date;

import javax.persistence.*;

import com.enums.HolidayType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

@Entity
@Table(name  = "employee_holidays")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Holidays extends Auditable<Holidays>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;


	@Column(name  = "start_day" , nullable = false)
	private Date startedDay;

	@Column(name = "end_day" , nullable = false)
	private Date endDay;

	@Column(name = "description" , nullable = true)
	private String description;


	/*Employee FK*/
     @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name  = "employee_id" , nullable = false)
	 private Employee employees;

	




	@Column(name  = "is_paid" , nullable = false)
	private boolean  isPaid;

	@Column(name = "holiday_type" , nullable = false)
	private HolidayType type;

	@Column(name  = "is_open" , nullable = true)
	private boolean isOpen;



}
