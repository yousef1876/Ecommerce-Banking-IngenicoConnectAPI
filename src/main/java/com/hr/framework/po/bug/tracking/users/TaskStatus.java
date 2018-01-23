package com.hr.framework.po.bug.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table( name = "task_status")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class TaskStatus extends Auditable<TaskStatus>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "status_id", updatable = false, nullable = false)
	private Long id;
	
	/*Task FK*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "task_id" , nullable = false)
	private Tasks tasks;
	
	@Column(name = "note" , nullable = true)
	private String note;
	
	@Column(name = "description" , nullable = false)
	private String description;
	
	@Column(name = "added_date" , nullable = false)
	private Date addedDate;
	
	@Column(name = "modified_name" , nullable = true)
	private Date modifiedDate;
	
	/*User FK*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id" , nullable = false)
    private Users users;
	
}
