package com.springdemo.model;

import org.springframework.stereotype.Component;

@Component("employeeBean")
public class Employee {

	private int employeeId;
	private String name;

	public Employee() {
		System.out.println("From constructor");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}

}
