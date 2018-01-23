package com.hr.framework.po.store;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.address.City;
import com.hr.framework.po.address.Country;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "store_address")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class StoreAddress extends Auditable<StoreAddress>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name  = "address_name" , nullable = false)
	private String addressName;

	@Column(name  = "title" , nullable = false)
	private String title;

	@Column(name  = "description" , nullable = true)
	private String description;

	@Column(name  = "note" , nullable = true)
	private String note;
	
	/*StoreStreet FK*/

	@Column(name  = "building_name" , nullable = false)
	private String buildingName;

	@Column(name  = "building_street_number" , nullable = false)
	private String buildingStreetNumber;
	
	
	/* City FK*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "city_id" , nullable = false)
	private City city;

	/*Country FK*/


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "country_id" , nullable = false)
	private Country country;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name  = "store_street_address_id" , nullable = false)
	private StoreStreetAddress storeStreetAddress;


	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "storeAddress")
	private List<Store> storeList = new ArrayList<>();

}
