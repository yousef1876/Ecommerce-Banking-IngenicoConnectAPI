package com.hr.framework.po.person;

import java.util.Date;

import javax.persistence.*;

import com.enums.UniversityDegreeTyped;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

@Entity
@Table( name = "degree_obtained")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class DegreeObtained extends Auditable<DegreeObtained> {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "university_name" , nullable = false)
	private String universityName;
	
	@Column(name = "from_date" , nullable = false)
	private Date fromDate;
	
	@Column(name = "to_date" , nullable = false)
	private Date toDate;
	
	@Column(name = "university_place" , nullable = false)
	private String universityPlace;
	
	@Column(name = "iscompleted" , nullable = false)
	private boolean iscompleted;
	
	@Column(name = "faculty_name" , nullable = false)
	private String facultyName;
	
	@Column(name = "major_name" , nullable = false)
	private String majorName;
	
	@Column(name = "gpa" , nullable = false)
	private String GPA;
	
	@Column(name = "degree_typed" , nullable = false)
	private UniversityDegreeTyped typed;
	
	
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "person_id" , nullable = false)
	private Person persons;


	
	/*Person FK*/
	
}
