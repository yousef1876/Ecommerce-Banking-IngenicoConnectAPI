package com.hr.framework.po.employee.base;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employee_salary" )
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Salary extends Auditable<Salary>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "amount" , nullable = false)
    private String amount;

	@Column(name = "currency" , nullable = false)
    private String currency;



    /*Employee FK*/
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "employee_id" , nullable = false)
	private Employee employees;



}
