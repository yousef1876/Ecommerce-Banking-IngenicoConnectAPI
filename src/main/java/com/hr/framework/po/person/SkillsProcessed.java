package com.hr.framework.po.person;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.embedded.pk.CompositeKeySkills;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

@Entity
@Table(name = "skills_processed")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class SkillsProcessed extends Auditable<SkillsProcessed> implements Serializable{

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "id", updatable = false, nullable = false)
	 private Long id;


	 @Column(name = "description" , nullable = true)
	 private String description;
	 
	 @Column(name = "note" , nullable = true)
	 private String note;
	 
	 @Column(name = "last_used" , nullable = false)
	 private Date lastUsed;

	 
	 @ManyToOne(fetch =  FetchType.LAZY)
	 @JoinColumn(name = "skill_id" , nullable = false)
	 private Skills skills;
	 
	
	 @ManyToOne(fetch =  FetchType.LAZY)
	 @JoinColumn(name = "person_id" , nullable = false)
	 private Person persons;
	 
	 

	
	 	
	/*Skill FK*/
	
	/*FK person*/
	

}
