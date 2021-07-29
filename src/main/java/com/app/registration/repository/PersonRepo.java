package com.app.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.registration.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Long>{
	
	@Query("from Person where personName=:personName")
	public Person findByPersonName(@Param("personName") String personName);
	

}
