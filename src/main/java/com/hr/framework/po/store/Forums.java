package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "forums")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Forums extends Auditable<Forums>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fourm_id", updatable = false, nullable = false)
	private Long id;


	@Column(name  = "forum_name" , nullable = false)
	private String forumName;

	@Column(name  = "title" , nullable = false)
	private String title;
	
	/* ForumGroup FK*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id" , nullable = false)
	private ForumGroup groups;


	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name  = "note" , nullable = true)
	private String note;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "forums")
	private List<BlogPost> blogPosts = new ArrayList<>();

}
