package com.springjdbctemplate.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setId(rs.getInt("id"));
		person.setFirst_name(rs.getString("first_name"));
		person.setLast_name(rs.getString("last_name"));
		person.setAge(rs.getInt("age"));
		return person;
	}

}
