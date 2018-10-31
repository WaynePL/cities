package org.wecancodeit.cities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.cities.model.State;
import org.wecancodeit.cities.repository.StateRepository;

@Controller
public class CitiesController {

	@Autowired
	StateRepository stateRepo;

	@GetMapping({ "", "/" })
	public String getHome() {
		return "index";
	}

	@PostMapping("/add-state")
	public String addState(String name, String abbreviation, String motto, String fish, Model model) {
		stateRepo.save(new State(name, abbreviation, motto, fish, "/states/" + abbreviation + "/cities"));
		System.out.println(name);
		return "index";
	}
}
