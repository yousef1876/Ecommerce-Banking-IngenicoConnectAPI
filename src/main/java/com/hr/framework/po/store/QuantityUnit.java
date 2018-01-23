package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "quantity_unit")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class QuantityUnit extends Auditable<QuantityUnit>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id", updatable = false, nullable = true)
	private Long id;


	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name  = "note" , nullable = true)
	private String note;

	@Column(name  = "unit" , nullable = false)
	private String unit;

	@Column(name  = "amount" , nullable = false)
	private String amount;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "quantityUnit")
	private List<Product> productList = new ArrayList<>();

}
