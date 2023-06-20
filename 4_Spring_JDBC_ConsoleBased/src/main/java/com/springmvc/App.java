package com.springmvc;

import java.sql.ResultSet;
//XMLBasedConfiguration
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springmvc/config.xml");

		JdbcTemplate jd = context.getBean("jdbcTemplate", JdbcTemplate.class);
		System.out.println(jd.getDataSource().getConnection());

		// Insert
//		String sql = "insert into student(id,name,address) value(?,?,?)";
//
//		int i = jd.update(sql, 1, "Indrajeet", "Nallasopara");
//		System.out.println(i + " Record Inserted Successfully");

		// Update
//		String sql = "update student set name=?,address=? where id=?";
//		int i = jd.update(sql,"Indrajeet12", "Nallasopara12",2);
//		System.out.println(i + " Record Updated Successfully");

		// Delete
//		String sql = "delete from student where id=?";
//		int i = jd.update(sql, 1);
//		System.out.println(i + " Record Deleted Successfully");

		// Fetch Data From DB for one Records
//		String sql = "select * from student where id=?";
//
//		RowMapper rowMapper = new RowMapper() {
//
//			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//				String name = rs.getString(2);
//				return name;
//			}
//
//		};
//		String name = jd.queryForObject(sql, rowMapper, 2);
//		System.out.println(name);

		// Fetch Data From DB for All Records
		String sql = "select * from student";

		RowMapper rowMapper = new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				String name = rs.getString(2);
				return name;
			}

		};
		List<String> list = jd.query(sql, rowMapper);
		for (String name : list) {
			System.out.println(name);
		}
	}
}
