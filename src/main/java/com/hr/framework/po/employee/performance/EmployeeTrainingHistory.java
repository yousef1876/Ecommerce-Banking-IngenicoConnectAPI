package com.hr.framework.po.employee.performance;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name  = "employee_training_history")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class EmployeeTrainingHistory extends Auditable<EmployeeTrainingHistory>{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "results" , nullable = false)
	private String results;

	@Column(name  = "note" , nullable = true)
	private String note;

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name  = "start_date" , nullable = false)
	private Date startDate;

	@Column(name  = "end_date" , nullable = false)
	private Date endDatre;

	@ManyToOne
	@JoinColumn(name  = "course_id" , nullable = false)
	private EmployeeCourses courses; /*Courses FK*/


}
