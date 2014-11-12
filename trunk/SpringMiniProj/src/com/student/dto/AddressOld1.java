package com.student.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AddressOld1 {
	
	@Column(name="dr_no")
	private String drNo;
	
	@Column(name="street_name")
	private String street;
	
	@Column(name="city_name")
	private String city;
	
	@Column(name="state_name")
	private String state;
	
	@Column(name="country")
	private String country;
	
	public AddressOld1(){
		
	}

	public AddressOld1(String drNo, String street, String city, String state,String country) {
	
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
