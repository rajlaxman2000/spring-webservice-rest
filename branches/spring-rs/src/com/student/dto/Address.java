package com.student.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlElement;

@Embeddable
public class Address {
	
	@Column(name="dr_no")
	@XmlElement(name="drNo")
	private String drNo;
	
	@Column(name="street_name")
	@XmlElement(name="street")
	private String street;
	
	@Column(name="city_name")
	@XmlElement(name="city")
	private String city;
	
	@Column(name="state_name")
	@XmlElement(name="state")
	private String state;
	
	@Column(name="country")
	@XmlElement(name="country")
	private String country;
	
	public Address(){
		
	}

	public Address(String drNo, String street, String city, String state,String country) {
	
		this.drNo = drNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	/**
	 * @return the drNo
	 */
	public String getDrNo() {
		return drNo;
	}

	/**
	 * @param drNo the drNo to set
	 */
	public void setDrNo(String drNo) {
		this.drNo = drNo;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	

}
