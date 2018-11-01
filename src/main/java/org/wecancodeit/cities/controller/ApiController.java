package org.wecancodeit.cities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.cities.model.City;
import org.wecancodeit.cities.model.State;
import org.wecancodeit.cities.repository.CityRepository;
import org.wecancodeit.cities.repository.StateRepository;

@RestController
public class ApiController {

	@Autowired
	StateRepository stateRepo;
	
	@Autowired
	CityRepository cityRepo;
	
	@GetMapping("/api/states/{abbr}")
	public State getState(@PathVariable(value = "abbr") String abbr) {
		return stateRepo.findByAbbreviationIgnoreCase(abbr);
	}
	
	@GetMapping("/api/cities/{name}")
	public City getCity(@PathVariable(value = "name") String name) {
		return cityRepo.findByCityNameIgnoreCase(name);
	}
	
}
