package org.wecancodeit.cities.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class City {

	@Id
	@GeneratedValue
	private Long Id;
	private String cityName;
	private String population;
	private String state;

	public City() {
	}

	public City(String name, String population, String state) {
		this.cityName = name;
		this.population = population;
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Long getId() {
		return Id;
	}

	public String getCityName() {
		return cityName;
	}

	public String getPopulation() {
		return population;
	}

}
