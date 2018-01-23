package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "forum_post")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ForumPost extends Auditable<ForumPost>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "post_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name  = "title" , nullable = false)
	private String title;

	@Column(name  = "text" , nullable = false)
	private String text;
	
	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name  = "note" , nullable = true)
	private String note;
	
	/* Customer Id FK */

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "customer_id" , nullable = false)
	private Customer customers;

	/* Topic FK */

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "topic_id" , nullable = false)
	private ForumTopic topics;
	
	
	
}
