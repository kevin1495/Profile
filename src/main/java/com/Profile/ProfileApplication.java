package com.Profile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.Profile.model.Person;
import com.Profile.repository.PersonRepository;

@SpringBootApplication
public class ProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Person("Kevin", "Anggawijaya", true, 23));
			repository.save(new Person("Sandy", "Kurniawan", true, 24));
			repository.save(new Person("Jefry", "Wijaya", true, 22));
			repository.save(new Person("Ryanrich", "Kalistone", true, 25));

			// fetch all customers
			for (Person person : repository.findAll()) {
				System.out.println(person.toString());
			}
		};
	}

}
