package com.Profile.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Profile.model.Person;
import com.Profile.repository.PersonRepository;

@Service
public class PersonService {

	private final PersonRepository mPersonRepository;
	
	public PersonService(PersonRepository mPersonRepository) {
		this.mPersonRepository = mPersonRepository;
	}
	
	public java.util.List<Person> getAll() {
		return mPersonRepository.findAll();
	}
	
	public Person getPerson(@PathVariable("id") Long personId) {
		return mPersonRepository.findByPersonId(personId);
	}
	
	public Person newPerson(@RequestBody Person mPerson) {
		return mPersonRepository.save(mPerson);
	}
	
	public void deletePerson(@PathVariable Long id) {
		mPersonRepository.deleteById(id);
	}
	
	public Person replacePerson(@RequestBody Person newPerson, @PathVariable Long id) {
		newPerson.setPersonId(id);
		return mPersonRepository.save(newPerson);
	}
	
}
