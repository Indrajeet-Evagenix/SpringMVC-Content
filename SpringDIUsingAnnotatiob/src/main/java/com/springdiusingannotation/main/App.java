package com.springdiusingannotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.springdiusingannotation.Configuration.ConfigurationConfig;
import com.springdiusingannotation.model.Application;
import com.springdiusingannotation.model.Bond;
import com.springdiusingannotation.model.Driver;
import com.springdiusingannotation.model.Employee;
import com.springdiusingannotation.model.Performer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(
    			ConfigurationConfig.class);

		// Byname Autowiring
//		Application application = (Application) context.getBean("application");
//		System.out.println("Application Details : " + application);
//
//		
//		// ByType Autowiring
//		Employee employee = (Employee) context.getBean("employee");
//		System.out.println("Employee Details : " + employee);
		
		
		
		// By Constructor Autowiring
//		Performer performer = (Performer) context.getBean("performer");
//		System.out.println("Performer Details : " + performer);
//
//		// Setter Autowiring
//		Driver driver = (Driver) context.getBean("driver");
//		System.out.println("Driver Details : " + driver);

		Bond bond = (Bond) context.getBean("bond");
		bond.showCar();
    }
}
