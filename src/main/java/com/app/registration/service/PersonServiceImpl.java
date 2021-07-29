package com.app.registration.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.registration.model.Person;
import com.app.registration.repository.PersonRepo;

@Service
@Transactional
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonRepo repo;
	
	@Override
	public Person addPerson(Person person) {
	
		return repo.save(person);
	}

	@Override
	public Person getPersonById(long id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

	@Override
	public Person getPersonByName(String personName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getAllPersons() {
		
		return repo.findAll();
	}

	@Override
	public Person updatePerson(Person person) {
		
		return repo.save(person);
	}

	@Override
	public boolean deletePersonById(long id) {
		
		 repo.deleteById(id);
		 return  !repo.existsById(id);
	}
	
	
	

}
 