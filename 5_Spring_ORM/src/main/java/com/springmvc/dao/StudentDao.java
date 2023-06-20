package com.springmvc.dao;

import java.util.List;

import com.springmvc.Student;

public interface StudentDao {

	public int saveStudent(Student student);

	public Student getStudent(int id);

	public List<Student> getAllStudent();

	public void updateStudent(Student student);

	public void deleteStudent(int id);

	public Student getStudentBy(String em, int id);
}