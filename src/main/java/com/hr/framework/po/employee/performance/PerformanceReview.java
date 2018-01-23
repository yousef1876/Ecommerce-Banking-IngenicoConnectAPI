package com.hr.framework.po.employee.performance;

import java.util.Date;

import javax.persistence.*;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Department;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

@Entity
@Table(name = "employee_performance_review")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class PerformanceReview extends Auditable<PerformanceReview>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "start_date" , nullable = false)
	private Date startDate;

	@Column(name = "end_date" , nullable = false)
	private Date endDate;

	@Column(name  = "details" , nullable = false)
	private String details;

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name  = "note" , nullable = true)
	private String note;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id" , nullable = false)
	private Employee employees; /*Employee FK*/

	@ManyToOne
	@JoinColumn(name  = "department_id" , nullable = false)
	private Department depts; /*Department FK*/

	@Column(name  = "stage_name" , nullable = false)
	private String stageName;

	@ManyToOne
	@JoinColumn(name = "admin_id" , nullable = false)
	private Employee admins; /*Employee FK*/



}
