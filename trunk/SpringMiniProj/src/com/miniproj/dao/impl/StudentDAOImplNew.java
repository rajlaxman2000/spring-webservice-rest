package com.miniproj.dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;
import com.miniproj.controllers.AppException;
import com.miniproj.dao.StudentDAO;
import com.student.dto.Student;

public class StudentDAOImplNew implements StudentDAO {
	
	
	private HibernateTemplate hibernateTemplate;


	@Override
	public Student searchStudent(int studentId) throws AppException {
		
		Student student=null;
		try{
			student = (Student)hibernateTemplate.get(Student.class, studentId);
			
			
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}	
		return student;
	}
	

	@Override	
	public Student updateStudent(Student student) throws AppException {
		
		try{
			hibernateTemplate.update(student);
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}	
		return searchStudent(student.getId());
	}

	@Override
	
	public int insertStudent(Student student) throws AppException {
			
			try{
				hibernateTemplate.save(student);
			}catch (Exception e) {
				throw new AppException(e.getMessage());
			}	
			
		return student.getId();
	}

	@Override	
	public boolean deleteStudent(int studentId) throws AppException {
		try{
			hibernateTemplate.delete(hibernateTemplate.get(Student.class,studentId));
			
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}	
		return true;
	}


	/**
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
