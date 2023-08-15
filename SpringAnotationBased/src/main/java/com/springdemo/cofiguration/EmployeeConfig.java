package com.springdemo.cofiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.springdemo.model.Employee;

@Configuration
@ComponentScan("com.springdemo")
public class EmployeeConfig {

//	@Bean(name = "employeeBean")
//	@Description("This is a sample Employee Bean")
//	public Employee EmployeeConfig() {
//		return new Employee();
//	}
	
//	public int EmployeeConfig(int a) {
//		return a;
//	}
	

}
