package org.wecancodeit.cities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.cities.model.City;
import org.wecancodeit.cities.model.State;
import org.wecancodeit.cities.repository.CityRepository;
import org.wecancodeit.cities.repository.StateRepository;

@Controller
public class CitiesController {

	@Autowired
	StateRepository stateRepo;
	
	@Autowired
	CityRepository cityRepo;

	@GetMapping({ "", "/" })
	public String getHome( Model model) {
		model.addAttribute("states", stateRepo.findAll());
		return "index";
	}
	
	@GetMapping("states/{abbr}")
	public String getStatePage(@PathVariable(value = "abbr") String abbr) {
		return "state";
	}

	@PostMapping("/add-state")
	public String addState(String name, String abbreviation, String motto, String fish, Model model) {
		stateRepo.save(new State(name, abbreviation, motto, fish, "/states/" + abbreviation + "/cities"));
		return "redirect:/";
	}
	
	@PostMapping("/add-city")
	public String addCity(String name, String population, String stateName, Model model) {
		System.out.println(stateName);
		cityRepo.save(new City(name, population, stateName));
		return "redirect:/";
	}
}
