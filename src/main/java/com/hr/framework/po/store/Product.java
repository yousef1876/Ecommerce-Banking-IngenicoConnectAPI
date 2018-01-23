package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "productTable")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class Product extends Auditable<Product>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column(name  = "meta_keyword" , nullable = false)
	private String metaKeyword;

	@Column(name  = "full_description" , nullable = true)
	private String fullDescription;

	@Column(name  = "meta_title" , nullable = false)
	private String metaTitle;

	@Column(name  = "name" , nullable = false)
	private String name;

	@Column(name  = "manufactuer_part_number" , nullable = false)
	private String manufacturerPartNumber;

	@Column(name =  "price" , nullable = false)
	private String price;

	@Column(name  = "old_price" , nullable = true)
	private String oldPrice;

	@Column(name = "max_price" , nullable = true)
	private String maxPrice;

	@Column(name = "length" , nullable = true)
	private String length;

	@Column(name  = "width" , nullable = true)
	private String width;

	@Column(name  = "height" , nullable = true)
	private String height;

	@Column(name  = "special_price" , nullable = true)
	private String specialPrice;

	@Column(name  = "discount" , nullable = true)
	private String discount;

	@Column(name  = "max_length" , nullable = true)
	private String maxLength;
	
	@Column(name  = "max_width" , nullable = true)
	private String maxWidth;

	@Column(name  = "max_height" , nullable = true)
	private String maxHeight;
	
	
	/* Category Product FK*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "category_id" , nullable = false)
	private ProductCategory products;


	/* Store FK */
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "store_id" , nullable = false)
	private Store stores;

	/*Quantity Unity*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "unit_id" , nullable = false)
	private QuantityUnit quantityUnit ;


	/* Quality FK*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "quality_id" , nullable = false)
	private ProductQuality productQuality;


	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "products")
	private List<ReturnBackProduct> backProducts = new ArrayList<>();


	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "products")
	private List<TierPrice> tierPriceList = new ArrayList<>();
}
