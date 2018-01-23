package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "return_back_product")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ReturnBackProduct extends Auditable<ReturnBackProduct>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id", updatable = false, nullable = true)
	private Long id;

	
	/* Customer FK*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "customer_id" , nullable = false)
	private Customer customers;

	/* Product FK*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "product_id" , nullable = false)
	private Product products;


	@Column(name  = "return_price" , nullable = false)
	private String returnPrice;

	@Column(name  = "discount" , nullable = false)
	private String discount;

}
