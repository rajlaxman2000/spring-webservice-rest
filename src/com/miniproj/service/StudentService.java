package com.miniproj.service;

import com.miniproj.controllers.AppException;
import com.student.dto.Student;

public interface StudentService {
	
	public Student getStudentById(String stdId) throws AppException;
	
	public Student modifyStudent(Student student) throws AppException;
	
	public int addStudent(Student student) throws AppException;
	
	public boolean deleteStudent(String studentId) throws AppException;
	
	

}
