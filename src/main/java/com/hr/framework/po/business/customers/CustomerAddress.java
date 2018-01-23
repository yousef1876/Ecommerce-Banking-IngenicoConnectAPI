package com.hr.framework.po.business.customers;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customers" )
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class CustomerAddress extends Auditable<CustomerAddress>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "address_name" , nullable = false)
	private String addressName;
	
	@Column(name = "city" , nullable = true)
	private String city;
	
	@Column(name = "country" , nullable = true)
	private String country;
	
	@Column(name = "state" , nullable = true)
	private String state;
	
	@Column(name = "from_date" , nullable = false)
	private Date fromDate;
	
	@Column(name  = "to_date" , nullable = true)
	private Date toDate;
	
	@Column(name = "present" , nullable = true)
	private boolean present;
	
	@Column(name = "description" , nullable = true)
	private String description;
	
	@Column(name = "note" , nullable = true)
	private String note;
	
	
	/*Customer FK*/
	
	
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "customer_id" , nullable = false )
	private Customers customers;



	
}
