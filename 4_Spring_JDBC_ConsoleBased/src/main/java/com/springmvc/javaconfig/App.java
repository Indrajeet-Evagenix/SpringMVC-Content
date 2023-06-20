package com.springmvc.javaconfig;

// JavaBasedConfiguration
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		JdbcTemplate jd = context.getBean("jdbc", JdbcTemplate.class);
		System.out.println(jd.getDataSource().getConnection());

		String sql = "insert into student(id,name,address) value(?,?,?)";

		int i = jd.update(sql, 2, "Indrajeet", "Nallasopara");
		System.out.println(i + " Record Inserted Successfully");
	}

}
