package com.springdemo.main1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.springdemo.cofiguration.Emp;
import com.springdemo.cofiguration.EmployeeConfig;
import com.springdemo.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee bean = (Employee) context.getBean("employeeBean");

		bean.setEmployeeId(444);
		bean.setName("jayshree");
		System.out.println(bean);
//		Employee bean1 = (Employee) context.getBean("employeeBean");
		bean.setEmployeeId(44);
		bean.setName("Indrajeet");
		System.out.println(bean);

//		System.out.println(bean1);
//		Emp emp = new Emp();
//		emp.EmployeeConfig(9);
		

		context.close();
	}
}
