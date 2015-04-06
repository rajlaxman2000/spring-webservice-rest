package com.student.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@Entity
@Table(name="student")
@XmlRootElement(name="student")  
@XmlAccessorType(XmlAccessType.NONE)
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="id")
	@XmlElement(name="studentId")  
	private int id;
	
	@Column(name="first_name")
	@XmlElement(name="firstName")  
	private String firstName;
	
	@Column(name="last_name")
	@XmlElement(name="lastName")
	private String lastName;
	
	@Column(name="email_id")
	@XmlElement(name="emailId")
	private String emailId;
	
	@Column(name="phone_number")
	@XmlElement(name="phoneNumber")
	private String phoneNumber;
	
	@Embedded	
	@XmlElement(name="address")
	private Address address;
	
	
	public Student(){
		
	}


	public Student(int id, String firstName, String lastName, String emailId, String phoneNumber, Address address) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}


	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}


	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
