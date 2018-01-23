package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.address.City;
import com.hr.framework.po.address.Country;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "store_street_address")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class StoreStreetAddress extends Auditable<StoreStreetAddress>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "street_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "name" , nullable = false)
	private String name;

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name = "note" , nullable = true)
	private String note;

	@Column(name  = "place_of_interest" , nullable = false)
	private String placeOfInterest;
	
	/* City FK*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "city_id" , nullable = false)
	private City city;


	/* Country FK*/
	@ManyToOne(fetch =  FetchType.LAZY)
	@JoinColumn(name  = "country_id" , nullable = false)
	private Country country;
	
}
