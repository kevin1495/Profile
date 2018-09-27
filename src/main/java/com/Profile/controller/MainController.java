package com.Profile.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Profile.model.Person;
import com.Profile.service.PersonService;

@RestController
public class MainController {
	private final PersonService mPersonService;
	
	public MainController(PersonService mPersonService) {
		this.mPersonService = mPersonService;
	}

	@GetMapping("/persons")
	public java.util.List<Person> getAll() {
		return mPersonService.getAll();
	}
	
	@GetMapping("/persons/{id}")
	public Person getPerson(@PathVariable("id") Long personId) {
		return mPersonService.getPerson(personId);
	}
	
	@PostMapping("/persons")
	public Person newPerson(@RequestBody Person mPerson) {
		return mPersonService.newPerson(mPerson);
	}
	
	@DeleteMapping("/persons/{id}")
	public void deletePerson(@PathVariable Long id) {
		mPersonService.deletePerson(id);
	}
	
	@PutMapping("/persons/{id}")
	public Person replacePerson(@RequestBody Person newPerson, @PathVariable Long id) {
		newPerson.setPersonId(id);
		return mPersonService.replacePerson(newPerson, id);
	}
}
