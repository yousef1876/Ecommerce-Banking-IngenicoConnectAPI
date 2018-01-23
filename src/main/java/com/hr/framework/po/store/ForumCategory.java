package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "fourm_catogery")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ForumCategory extends Auditable<ForumCategory>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "topic_id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "catogery" , nullable = false)
	private String catogery;

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name  = "note" , nullable = true)
	private String note;

	@Column(name  = "text" , nullable = false)
	private String text;

	@Column(name  = "code" , nullable = true)
	private String code;

   @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "category")
   private List<ForumTopic> forumTopicList = new ArrayList<>();
	

}
