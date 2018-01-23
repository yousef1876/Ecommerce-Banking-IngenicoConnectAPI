package com.hr.framework.po.employee.performance;

import java.util.Date;

import javax.persistence.*;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Department;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

@Entity
@Table(name  = "employee_job_assignment")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class EmployeeJobAssignment extends Auditable<EmployeeJobAssignment>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "start_date" , nullable = false)
	private Date startDate;

	@Column(name  = "finished_date" , nullable = false)
	private Date finishedDate;

	@Column(name  = "details" , nullable = false)
	private String details;

	@ManyToOne
	@JoinColumn(name  = "employee_id" , nullable = false)
	private Employee employees; /*Employee FK*/

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name  = "note" , nullable = true)
	private String note;

	@ManyToOne
	@JoinColumn(name  = "department_id" , nullable = false)
	private Department depts; /*Department FK*/

	@Column(name  = "assignment_name" , nullable = false)
	private String assignmentName;

	@ManyToOne
	@JoinColumn(name  = "admin_id" , nullable = false)
	private Employee admins; /* Employee FK*/


}
