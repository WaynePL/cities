package org.wecancodeit.cities.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class State {

	@Id
	@GeneratedValue
	private Long Id;
	private String name;
	private String abbreviation;
	private String motto;
	private String fish;
	private String citiesUrl;

	public State(String name, String abbreviation, String motto, String fish, String citiesUrl) {
		this.name = name;
		this.abbreviation = abbreviation;
		this.motto = motto;
		this.fish = fish;
		this.citiesUrl = citiesUrl;
	}

	public State() {
	}

	public Long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public String getMotto() {
		return motto;
	}

	public String getFish() {
		return fish;
	}

	public String getCitiesUrl() {
		return citiesUrl;
	}

}
