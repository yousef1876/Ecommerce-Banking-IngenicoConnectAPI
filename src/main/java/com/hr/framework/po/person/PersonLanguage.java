package com.hr.framework.po.person;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "person_language")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class PersonLanguage extends Auditable<PersonLanguage>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	/*Language FK*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "language_code_id" , nullable = false)
	private LanguageCode code;



	/*Person FK*/
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "country_id" , nullable = false)
	private CountryCode codes;
	
	

}
