package org.wecancodeit.cities.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {

	@Id
	@GeneratedValue
	private Long Id;
	private String name;
	private String population;
	@ManyToOne
	private State state;

	public City() {
	}

	public City(String name, String population) {
		this.name = name;
		this.population = population;
	}

	public State getState() {
		return state;
	}

	public Long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public String getPopulation() {
		return population;
	}

}
