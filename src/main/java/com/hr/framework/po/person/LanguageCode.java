package com.hr.framework.po.person;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "language_code")
@Data
@Cacheable(true)
public class LanguageCode {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "lang_code" , nullable = false)
	private String langCode;
	
	@Column(name = "lang_name" , nullable = false)
	private String langName;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "code")
	private List<PersonLanguage> langs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLangCode() {
		return langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public String getLangName() {
		return langName;
	}

	public void setLangName(String langName) {
		this.langName = langName;
	}

}
