package com.miniproj.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//import org.springframework.orm.hibernate3.HibernateTemplate;
import com.miniproj.controllers.AppException;
import com.miniproj.dao.StudentDAO;
import com.student.dto.Address;
import com.student.dto.Student;

public class StudentDAOImpl implements StudentDAO {
	
	
	@PersistenceContext
	 private EntityManager entityManager;


	@Override
	public Student searchStudent(int studentId) throws AppException {
		
		Student student=null;
		try{
			student = (Student)entityManager.find(Student.class, studentId);
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}	
		return student;
	}
	

	@Override	
	public Student updateStudent(Student student) throws AppException {
		Student studentSrc=null;
		Address addressSrc = null;
		try{
			studentSrc = (Student)entityManager.find(Student.class, student.getId());
			addressSrc = studentSrc.getAddress();		
			//entityManager.getTransaction().begin();
				studentSrc.setFirstName(student.getFirstName());
				studentSrc.setFirstName(student.getLastName());
				studentSrc.setFirstName(student.getEmailId());
				studentSrc.setFirstName(student.getPhoneNumber());				
					addressSrc.setDrNo(student.getAddress().getDrNo());				
					addressSrc.setStreet(student.getAddress().getStreet());
					addressSrc.setCity(student.getAddress().getCity());
					addressSrc.setState(student.getAddress().getState());
					addressSrc.setCountry(student.getAddress().getCountry());
				studentSrc.setAddress(addressSrc);	
				//entityManager.refresh(studentSrc);
			//hibernateTemplate.update(student);
			//entityManager.getTransaction().commit();
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}	
		return searchStudent(student.getId());
	}

	@Override
	
	public int insertStudent(Student student) throws AppException {
			
			try{
				entityManager.persist(student);
			}catch (Exception e) {
				throw new AppException(e.getMessage());
			}	
			
		return student.getId();
	}

	@Override	
	public boolean deleteStudent(int studentId) throws AppException {
		try{
			entityManager.remove((Student)entityManager.find(Student.class, studentId));			
		}catch (Exception e) {
			throw new AppException(e.getMessage());
		}	
		return true;
	}


	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}


	/**
	 * @param entityManager the entityManager to set
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	
}
