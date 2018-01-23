package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "forum_group")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ForumGroup extends Auditable<ForumGroup>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "group_id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "group_name" , nullable = false)
	private String groupName;

	@Column(name  = "group_role_permission" , nullable = false)
	private String groupRolePermission;

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name  = "note" , nullable = true)
	private String note;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "groups")
	private List<Forums> forums = new ArrayList<>();
}
