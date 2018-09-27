
package com.Profile.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Person {

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long personId;
	
	private String firstName;
	private String lastName;
	private Boolean isAlive;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String firstName, String lastName, Boolean isAlive, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.isAlive = isAlive;
		this.age = age;
	}
	
	public String getFirstName() {
	return firstName;
	}
	
	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}
	
	public String getLastName() {
	return lastName;
	}
	
	public void setLastName(String lastName) {
	this.lastName = lastName;
	}
	
	public Boolean getIsAlive() {
	return isAlive;
	}
	
	public void setIsAlive(Boolean isAlive) {
	this.isAlive = isAlive;
	}
	
	public Integer getAge() {
	return age;
	}
	
	public void setAge(Integer age) {
	this.age = age;
	}
	
	
	
	public Long getPersonId() {
		return personId;
	}
	
	
	
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", isAlive="
				+ isAlive + ", age=" + age + "]";
	}

}