package com.hr.framework.po.address;

import com.hr.framework.config.audit.Auditable;
import com.hr.framework.config.audit.EntityListener;
import com.hr.framework.po.employee.base.Employee;
import lombok.Data;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "state")
@Data
@EntityListeners(EntityListener.class)
@Cacheable(true)
public class State extends Auditable<State> {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	/*Country FK*/
	@ManyToOne(fetch  = FetchType.LAZY)
	@JoinColumn(name = "country_id" , nullable = false)
	private Country countries;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "states")
	private List<City> cities;
	
	
	@Column(name = "state" , nullable = false)
	private String state;
	
	@Column(name = "state_code" , nullable = true)
	private String stateCode;


	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "state")
	private List<Employee> employees;

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Country getCountries() {
		return countries;
	}

	public void setCountries(Country countries) {
		this.countries = countries;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	
	
	
	
	
}
