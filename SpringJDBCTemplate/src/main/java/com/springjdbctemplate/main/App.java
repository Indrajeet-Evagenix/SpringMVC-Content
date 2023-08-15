package com.springjdbctemplate.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbctemplate.config.AppConfig;
import com.springjdbctemplate.dao.PersonDAO;
import com.springjdbctemplate.entity.Person;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		PersonDAO personDAO = context.getBean(PersonDAO.class);

		System.out.println("List of All Person is: ");
		for (Person p : personDAO.getAllPersons()) {
			System.out.println(p);
		}

//		System.out.println("Get Person details with ID: 2");
//		Person p = personDAO.getPersonById(2);
//		System.out.println(p);
//
//		System.out.println("Insert Person Details: ");
//		Person person = new Person("Indrajeet", "Gupta", 25);
//		System.out.println(person);
//		personDAO.createPerson(person);
//		System.out.println("List of All Person is: ");
//		for (Person p1 : personDAO.getAllPersons()) {
//			System.out.println(p1);
//		}
//
//		System.out.println("Deleting Person With ID: 3");
//		personDAO.deletePerson(person);
//
//		System.out.println("List of All Person is: ");
//		for (Person p1 : personDAO.getAllPersons()) {
//			System.out.println(p1);
//		}
//
//		System.out.println("Update Person With ID: 5");
//		Person person2 = personDAO.getPersonById(5);
//		person2.setFirst_name("Suraj");
//		personDAO.updatePerson(person2);
//		System.out.println("List of All Person is: ");
//		for (Person p1 : personDAO.getAllPersons()) {
//			System.out.println(p1);
//		}
	}
}
