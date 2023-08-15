package com.springjdbctemplate.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@ComponentScan("com.springjdbctemplate")
//@PropertySource("classpath:database.properties")
public class AppConfig {

	//@Autowired
//	Environment environment;

//	private final String URL = "url";
//	private final String DRIVER = "driver";
//	private final String USERNAME = "username";
//	private final String PASSWORD = "password";

//	private final String URL = "jdbc:mysql://localhost:3306/jdbctemplate";
//	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
//	private final String USERNAME = "root";
//	private final String PASSWORD = "root";

	@Bean
	public DataSource dataSource() {
//		System.out.println(environment);
//		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//		driverManagerDataSource.setUrl(environment.getProperty(URL));
//		driverManagerDataSource.setUsername(environment.getProperty(USERNAME));
//		driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
//		driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));

		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/jdbctemplate");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

		return driverManagerDataSource;

	}

}
