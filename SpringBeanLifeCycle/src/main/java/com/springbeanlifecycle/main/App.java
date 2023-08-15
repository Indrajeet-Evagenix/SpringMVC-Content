package com.springbeanlifecycle.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springbeanlifecycle.config.AppConfig;
import com.springbeanlifecycle.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = (Employee) context.getBean("manager");
		employee.doWork();
		context.close();
	}
}
