package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "blog_post")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class BlogPost extends Auditable<BlogPost>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "blog_id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "blog_name" , nullable = false)
	private String blogName;

	@Column(name  = "blog_title" , nullable = false)
	private String blogTitle;

	@Column(name  = "description" , nullable = true)
	private String description;
	
	@Column(name  = "note" , nullable = true)
	private String note;

	@Column(name  = "content" , nullable = false)
	private String content;
	
	/* Fourm FK */

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "forum_id" , nullable = false)
	private Forums forums;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "posts")
	private List<BlogComment> blogComments = new ArrayList<>();




}
