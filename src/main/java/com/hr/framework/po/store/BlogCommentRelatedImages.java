package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name =  "blog_post_comments_imgs")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class BlogCommentRelatedImages extends Auditable<BlogCommentRelatedImages>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "iamge_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name  = "image_name" , nullable = false)
	private String imageName;

	@Column(name  = "file_system_path" , nullable = false)
	private String fileSystemPath;

	@Column(name  = "conent" , nullable = false)
	@Lob
	private byte[] content;

	/* Customer FK */

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id" , nullable = false)
	private Customer customers;


	/* BlogComment FK */

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "comment_id" , nullable = false)
	private BlogComment comments;

}
