package com.hr.framework.po.employee.base;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name  = "employee_deductions")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Discount extends Auditable<Discount>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "types" , nullable = false)
	private String type;

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name  = "note" , nullable =  true)
	private String note;

	@Column(name  = "created_date" , nullable = false)
	private Date createdDate;
	
	/* Employee FK*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id" ,  nullable = false)
	private Employee employees;




	/*Created By (Employee FK)*/

	@Column(name  = "amount" , nullable = false)
	private String amount;

}
