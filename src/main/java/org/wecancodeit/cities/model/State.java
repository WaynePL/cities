package org.wecancodeit.cities.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	@OneToMany(mappedBy = "state")
	private List<City> city = new ArrayList<>();

	public State(String name, String abbreviation, String motto, String fish, String citiesUrl) {
		this.name = name;
		this.abbreviation = abbreviation;
		this.motto = motto;
		this.fish = fish;
		this.citiesUrl = citiesUrl;
	}

	public State() {
	}

	public List<City> getCity() {
		return city;
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
