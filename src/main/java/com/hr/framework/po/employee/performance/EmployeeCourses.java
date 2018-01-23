package com.hr.framework.po.employee.performance;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Department;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

@Entity
@Table(name  = "employee_courses")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class EmployeeCourses extends Auditable<EmployeeCourses>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "start_date" , nullable = false)
	private Date startDate;

	@Column(name  = "end_date" , nullable = false)
	private Date endDate;

	@ManyToOne(  fetch = FetchType.LAZY)
	@JoinColumn(name  = "employee_id" , nullable = false)
	private Employee employees; /*Employee FK*/

	@ManyToOne
	@JoinColumn(name  = "department_id" , nullable = false)
	private Department departments; /*Department FK*/

	@Column(name  = "note" , nullable = true)
	private String note;

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name = "course_name" , nullable = false)
	private String courseName;


	@ManyToOne
	@JoinColumn(name  = "admin_id" , nullable = false)
	private Employee admins; /* Employee FK*/


	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY , mappedBy = "courses")
	private List<EmployeeTrainingHistory> courses;


}
