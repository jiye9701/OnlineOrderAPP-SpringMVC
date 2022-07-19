package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Users entity class - Model class
@Entity
@Table(name = "users")
public class Users {

	@Id
	@Column(name = "userNo")
	public int userNo;
	
	@Column(name = "userId")
	public String userId;
	
	@Column(name = "password")
	public String password;
	
	@Column(name = "firstname")
	public String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "phonenumber")
	private String phoneNumber;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "postalcode")
	private String postalCode;

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Users() {}

	public Users(String userId, String password, String firstname, String lastname, String phoneNumber,
			String address, String city, String postalCode) {
		super();
		this.userId = userId;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;

	}

	public Users(int userNo, String userId, String password, String firstname, String lastname,
			String phoneNumber, String address, String city, String postalCode) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;

	}

	public Users(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
}
