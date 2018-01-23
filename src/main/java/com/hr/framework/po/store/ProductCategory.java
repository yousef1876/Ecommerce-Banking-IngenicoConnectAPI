package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "product_catogery")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ProductCategory extends Auditable<ProductCategory>{
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "catogery_id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "catogery" , nullable = false)
	private  String catogery;

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name = "note" , nullable = true)
	private String note;


	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "products")
    private List<Product> productList = new ArrayList<>();

}
