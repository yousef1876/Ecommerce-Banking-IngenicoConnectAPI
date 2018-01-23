package com.hr.framework.po.store;

import com.enums.ProductQualityRating;
import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "product_quality")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class ProductQuality extends Auditable<ProductQuality>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id", updatable = false, nullable = true)
	private Long id;

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name = "note" , nullable = true)
	private String note;

	@Column(name  = "text" , nullable = false)
	private String text;

	@Column(name  = "rating" , nullable = false)
	private ProductQualityRating rating;

	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "productQuality")
	private List<Product> productList = new ArrayList<>();
}
