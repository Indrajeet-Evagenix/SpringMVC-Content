package com.springjdbctemplate.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjdbctemplate.entity.Person;
import com.springjdbctemplate.entity.PersonMapper;

@Component
public class PersonDAOImpl implements PersonDAO {

	JdbcTemplate jdbcTemplate;

	private final String findById = "select * from person where id=?";
	private final String deletebyId = "delete from person where id=?";
	private final String updatePerson = "update person set first_name=?, last_name=?, age=? where id=?";
	private final String insertPersonDetails = "insert into person(first_name, last_name, age) values(?,?,?)";
	private final String getAllPersonDetails = "select * from person";

	@Autowired
	public PersonDAOImpl(DataSource dataSource) {
		System.out.println("in dao"+dataSource);
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(findById, new Object[] { id }, new PersonMapper());
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(getAllPersonDetails, new PersonMapper());
	}

	@Override
	public boolean deletePerson(Person person) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(deletebyId, person.getId()) > 0;
	}

	@Override
	public boolean updatePerson(Person person) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(updatePerson, person.getFirst_name(), person.getLast_name(), person.getAge(),
				person.getId()) > 0;
	}

	@Override
	public boolean createPerson(Person person) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(insertPersonDetails, person.getFirst_name(), person.getLast_name(),
				person.getAge()) > 0;
	}

}
