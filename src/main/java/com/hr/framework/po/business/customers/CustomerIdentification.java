package com.hr.framework.po.business.customers;

import com.enums.CustomerIdentificationType;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer_identification")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class CustomerIdentification extends Auditable<CustomerIdentification>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	
	@Column(name = "id_number" , nullable = false)
	private String idNumber;
	
	@Column(name = "type" , nullable = false)
	private CustomerIdentificationType type;
	
	@Column(name = "expire_date" , nullable = true)
	private Date expireDate;
	
	@Column(name = "from_date" , nullable = false)
	private Date fromDate;
	
	@Column(name = "issue_by" , nullable = false)
	private String issueBy;
	
	@Column(name = "issue_country" , nullable = false)
	private String issueCountry;
	
	@Column(name = "note" , nullable = true)
	private String note;
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	/*Customer FK*/
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id" , nullable = false)
	private Customers customers;
	
}
