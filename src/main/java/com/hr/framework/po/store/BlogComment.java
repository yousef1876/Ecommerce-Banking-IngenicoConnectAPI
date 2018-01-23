package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "blog_comments")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class BlogComment extends Auditable<BlogComment>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "comment_id", updatable = false, nullable = false)
	private Long id;


	@Column(name  = "content" , nullable = false)
	private String content;

	@Column(name  = "title" , nullable = false)
	private String title;

	@Column(name  = "content_name" , nullable = false)
	private String contentName;
	
	@Column(name  = "email" , nullable = false)
	private String email;
	
	/*  Customer FK   */

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "customer_id" , nullable = false)
	private Customer customers;

	/* BlogPost FK   */

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "post_id" , nullable = false)
	private BlogPost posts;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "comments")
	private List<BlogCommentRelatedImages> commentRelatedImages = new ArrayList<>();

}
