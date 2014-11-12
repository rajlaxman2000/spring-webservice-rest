package com.miniproj.dao;

import com.miniproj.controllers.AppException;
import com.student.dto.Student;

public interface StudentDAO {

	
	public Student searchStudent(int studentId) throws AppException;
	
	public Student updateStudent(Student student) throws AppException;

	public int insertStudent(Student student) throws AppException;
	
	public boolean deleteStudent(int studentId) throws AppException;
	 
}

