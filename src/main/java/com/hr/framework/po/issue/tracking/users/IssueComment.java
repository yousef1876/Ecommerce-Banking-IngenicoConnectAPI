package com.hr.framework.po.issue.tracking.users;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  = "issue_comment")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class IssueComment extends Auditable<IssueComment>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "comment_id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "title" , nullable = false)
	private String title;

	@Column(name  = "text" , nullable = false)
	private String text;

	@Column(name  = "comments" , nullable = false)
	private String comments;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "issue_id" , nullable = false)
	private Issue issues;

	@Column(name  = "created_date" , nullable = false)
	@Temporal( TemporalType.TIMESTAMP)
	private Date createdDate;

	@Column(name  = "updated_date" , nullable = true)
	private Date updatedDate;





	
}
