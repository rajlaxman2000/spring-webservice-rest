package com.miniproj.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTransactionManager;

import com.miniproj.controllers.AppException;
import com.miniproj.dao.StudentDAO;
import com.student.dto.Student;

public class StudentDAOImplOld implements StudentDAO {
	
	private SessionFactory sessionFactory;
	
	private HibernateTransactionManager transactionManager;


	@Override
	public Student searchStudent(int studentId) throws AppException {
		
		Student student=null;
		try{
			student = (Student)sessionFactory.getCurrentSession().get(Student.class, Integer.valueOf(studentId).intValue());
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}	
		return student;
	}
	

	@Override	
	public Student updateStudent(Student student) throws AppException {
		
		try{
			sessionFactory.getCurrentSession().update(student);
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}	
		return searchStudent(student.getId());
	}

	@Override
	
	public int insertStudent(Student student) throws AppException {
			int id;
			try{
				id = (Integer) sessionFactory.getCurrentSession().save(student);
			}catch (Exception e) {
				throw new AppException(e.getMessage());
			}	
			
		return student.getId();
	}

	@Override	
	public boolean deleteStudent(int studentId) throws AppException {
		try{
			sessionFactory.getCurrentSession().createQuery("DELETE FROM Student WHERE id = "+studentId).executeUpdate();
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}	
		return true;
	}
	

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * @return the transactionManager
	 */
	public HibernateTransactionManager getTransactionManager() {
		return transactionManager;
	}

	/**
	 * @param transactionManager the transactionManager to set
	 */
	public void setTransactionManager(HibernateTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

}
