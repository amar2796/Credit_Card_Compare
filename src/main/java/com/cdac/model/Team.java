package com.cdac.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Team {
	
	private String fullName;
	@Id
	private String userId;
	private String password;
	private String mobileNumber;
	private String email;
	private String gender;
	private String fullAddress;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	@Override
	public String toString() {
		return "Team [fullName=" + fullName + ", userId=" + userId + ", password=" + password + ", mobileNumber="
				+ mobileNumber + ", email=" + email + ", gender=" + gender + ", fullAddress=" + fullAddress + "]";
	}
	public Team(String fullName, String userId, String password, String mobileNumber, String email, String gender,
			String fullAddress) {
		super();
		this.fullName = fullName;
		this.userId = userId;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.gender = gender;
		this.fullAddress = fullAddress;
	}
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
