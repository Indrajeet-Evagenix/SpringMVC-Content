package com.springmvc;

import java.applet.Applet;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.springmvc.dao.StudentDao;
import com.springmvc.dao.StudentDaoImpl;

public class App {
	public static void main(String[] args) {
		System.out.println("-----------------");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springmvc/config.xml");
		
//		  HibernateTemplate tem = context.getBean("template", HibernateTemplate.class);
//		  System.out.println(tem);
		 

		StudentDao dao = context.getBean("stDao", StudentDao.class);

//		Student st = new Student();
//		st.setId(1);
//		st.setName("Indrajeet");
//		st.setAddress("Nallasopara");

		
		// Insert
//		  int i = dao.saveStudent(st); System.out.println("Insert sucessfully " + i);
		 

		// Fetch Data From Id
//		  Student st = dao.getStudent(2); System.out.println(st);
		 

		// Update Student Record
//		  dao.updateStudent(st); System.out.println("Update Sucessfully");
		 

		
//		  dao.deleteStudent(2);
		  
		  List<Student> list = dao.getAllStudent(); for (Student sts : list) {
		  System.out.println(sts); }
		 

		Student sts = dao.getStudentBy("Indrajeet", 1);
		System.out.println(sts);
	}
}
