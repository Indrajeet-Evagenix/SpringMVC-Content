package com.springjdbctemplate.dao;

import java.util.List;

import com.springjdbctemplate.entity.Person;

public interface PersonDAO {
	
	Person getPersonById(int id);

	List<Person> getAllPersons();

	boolean deletePerson(Person person);

	boolean updatePerson(Person person);

	boolean createPerson(Person person);

}
