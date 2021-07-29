package com.app.registration.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;


@Entity


public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="person_name",length=50)
	private String personName;
	
	@Column(unique=true,nullable=false,length=50)
	private String email;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate birthDate;

	public Person(long id, String personName, String email, LocalDate birthDate) {
		super();
		this.id = id;
		this.personName = personName;
		this.email = email;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", personName=" + personName + ", email=" + email + ", birthDate=" + birthDate
				+ "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
