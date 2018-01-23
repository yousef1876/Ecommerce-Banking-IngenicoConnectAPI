package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name  = "tier_price")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class TierPrice extends Auditable<TierPrice>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "price_id", updatable = false, nullable = false)
	private Long id;
	
	/* product FK*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "product_id" , nullable = true)
	private Product products;

	/* Customer FK*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "customer_id" , nullable = false)
	private Customer customers;
	
    /* CreatedBy FK */
	
	@Column(name  = "delivery_date" , nullable = false)
	@Temporal(TemporalType.TIME)
	private Date deliveryDate;
	
	
	

}
