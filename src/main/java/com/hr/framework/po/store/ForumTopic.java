package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.business.crm.users.AssignedUsers;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "forum_topic")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ForumTopic extends Auditable<ForumTopic>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "topic_id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "title" , nullable = false)
	private String title;

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name  = "note" , nullable = true)
	private String note;
	
	/* Category Forum FK*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "category_id" , nullable = false)
	private ForumCategory category;

	
	/*  Users PO FK */

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "assigned_users" , nullable = false)
	private AssignedUsers assignedUsers;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL ,mappedBy = "topics")
	private List<ForumPost> forumPostList = new ArrayList<>();
	
}
