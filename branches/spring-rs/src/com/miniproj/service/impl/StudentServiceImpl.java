package com.miniproj.service.impl;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.miniproj.controllers.AppException;
import com.miniproj.dao.StudentDAO;
import com.miniproj.service.StudentService;
import com.student.dto.Student;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class StudentServiceImpl implements StudentService {
	
	private StudentDAO studentDAO;
	

	@Override
	public Student getStudentById(String stdId) throws AppException {
		Student student;
		try{
			student = studentDAO.searchStudent(Integer.valueOf(stdId).intValue());
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}	
		return student;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Student modifyStudent(Student student) throws AppException {
		Student resStudent;
		try{
			 resStudent = studentDAO.updateStudent(student);
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}	
		return resStudent;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public int addStudent(Student student) throws AppException {
		int id;
		try{
			id = studentDAO.insertStudent(student);
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}	
		return id;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public boolean deleteStudent(String studentId) throws AppException {
		boolean res;
		try{
			res = studentDAO.deleteStudent(Integer.valueOf(studentId).intValue());
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}	
		return res;
	}
	

	/**
	 * @return the studentDAO
	 */
	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	/**
	 * @param studentDAO the studentDAO to set
	 */
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}


}
