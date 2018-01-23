package com.hr.framework.po.person;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.enums.SkillLevel;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

@Entity
@Table(name = "skills")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Skills extends Auditable<Skills>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "skill_name" , nullable = false)
	private String skillName;
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	@Column(name = "note" , nullable = true)
	private String note;
	
	@Column(name = "level" , nullable = false)
	private SkillLevel level;

	@Column(name = "from_date" , nullable = false)
	private Date fromDate;
	
	@Column(name = "to_date" , nullable = false)
	private Date toDate;
	
	@OneToMany(fetch =  FetchType.LAZY , mappedBy = "skills")
	private List<SkillsProcessed> skills;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "person_id" , nullable = false)
	private Person persons;

}
