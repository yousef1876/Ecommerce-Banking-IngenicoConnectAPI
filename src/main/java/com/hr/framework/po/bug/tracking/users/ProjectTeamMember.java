package com.hr.framework.po.bug.tracking.users;

import javax.persistence.*;

import com.embedded.pk.CompositeKeyTeamMember;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Employee;
import com.hr.framework.po.person.Person;
import com.hr.framework.po.person.Skills;
import lombok.Data;

@Entity
@Table(name = "project_team_member")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ProjectTeamMember extends Auditable<ProjectTeamMember>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_id", updatable = false, nullable = false)
    private Long id;


	 @ManyToOne(fetch =  FetchType.LAZY)
	 @JoinColumn(name = "person_id" , nullable = true)
	 private Person persons;

	
	/*USER FK*/
	@ManyToOne
    @JoinColumn(name  = "employee_id" , nullable = false)
	private Employee employees;


	/*Project Version FK*/

	@ManyToOne
    @JoinColumn(name  = "version_id" , nullable = false)
    private ProjectVersion versions;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "team_id" , nullable = false)
	private Teams teams;
	
}
