package com.hr.framework.po.person;

import java.util.Date;

import javax.persistence.*;

import com.enums.IdentificationType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

@Entity
@Table(name = "identifications")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Identification extends Auditable<Identification>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	
	/*PERSON FK*/
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "person_id" , nullable = false)
	private Person persons;
	
	
	@Column(name = "number" , nullable = false)
	private String number;
	
	@Column(name = "issue_date" , nullable = false)
	private Date issueDate;
	
	@Column(name = "expire_date" , nullable = false)
	private Date expireDate;
	
	@Column(name = "issue_by" , nullable = false)
	private String issueBy;
	
	@Column(name = "issue_place" , nullable = false)
	private String issuePlace;
	
	@Column(name = "identification_type" , nullable = false)
	private IdentificationType type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getIssueBy() {
		return issueBy;
	}

	public void setIssueBy(String issueBy) {
		this.issueBy = issueBy;
	}

	public String getIssuePlace() {
		return issuePlace;
	}

	public void setIssuePlace(String issuePlace) {
		this.issuePlace = issuePlace;
	}

	public IdentificationType getType() {
		return type;
	}

	public void setType(IdentificationType type) {
		this.type = type;
	}
	
	
}
