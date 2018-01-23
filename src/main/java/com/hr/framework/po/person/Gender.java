package com.hr.framework.po.person;

import javax.persistence.*;

import com.enums.GenderType;
import lombok.Data;

@Entity
@Table(name = "gender")
@Data
@Cacheable(true)
public class Gender {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "gender" , nullable = false)
	private GenderType type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GenderType getType() {
		return type;
	}

	public void setType(GenderType type) {
		this.type = type;
	}
	
	
	
	
}
