package com.hr.framework.po.bug.tracking.users;

import java.util.Date;

import javax.persistence.*;

import com.enums.BugPriority;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

@Entity
@Table(name = "bugs_tasks" )
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Bugs extends Auditable<Bugs>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bug_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "bugs_name" , nullable = false)
	private String bugName;
	
	@Column(name = "bug_title" , nullable = false)
	private String bugTitle;
	
	@Column(name  = "added_date" , nullable = false)
	private Date addedDate;
	
	/* AddedBy FK */
	@ManyToOne
	@JoinColumn(name  = "employee_id" , nullable = false)
     private Employee employees;

	@Column(name = "modified_date" , nullable = true)
	private Date modifiedDate;
	
	/* ModifiedBY FK */
	@ManyToOne
	@JoinColumn(name  = "modify_id" , nullable = false)
	private Employee modifyBugs;


	@Column(name = "bugs_priority" , nullable = false)
	private BugPriority bugPriority;
	
	@Column(name = "open" , nullable = false)
	private boolean open;
	
	@Column(name = "closed" , nullable = true)
	private boolean closed;
	
	@Column(name = "reopen" , nullable = true)
	private boolean reopen;
	
	/* Assign TO FK*/

	@ManyToOne
	@JoinColumn(name  = "assign_id" , nullable = false)
	private Employee assignTo;



}
