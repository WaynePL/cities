package org.wecancodeit.cities.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class City {

	@Id
	@GeneratedValue
	private Long Id;
	private String cityName;
	private String population;
	
	@JsonIgnore
	@ManyToOne
	private State stateEntity;

	public City() {
	}

	public City(String name, String population, State stateEntity) {
		this.cityName = name;
		this.population = population;
		this.stateEntity = stateEntity;
	}

	public State getStateEntity() {
		return stateEntity;
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
