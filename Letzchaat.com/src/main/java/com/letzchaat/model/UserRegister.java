package com.letzchaat.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="User")
public class UserRegister {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="userid")
private int id;
@NotEmpty(message="fname can not be null")	
private String fname;
private String lname;
@NotEmpty(message="email cannot be null")
@Email
private String emailId;
private long mobile;
@Length(min=8, max=10)
private String password;
@NotEmpty(message="gender can not be null")
private String gender;
@DateTimeFormat(pattern="mm/dd/yyyy")
private Date dob;
private boolean isActive;

/* constructor*/
public UserRegister(){}
/**
 * @return the isActive
 */
public boolean isActive() {
	return isActive;
}
/**
 * @param isActive the isActive to set
 */
public void setActive(boolean isActive) {
	this.isActive = isActive;
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
 * @return the fname
 */
public String getFname() {
	return fname;
}
/**
 * @param fname the fname to set
 */
public void setFname(String fname) {
	this.fname = fname;
}
/**
 * @return the lname
 */
public String getLname() {
	return lname;
}
/**
 * @param lname the lname to set
 */
public void setLname(String lname) {
	this.lname = lname;
}

/**
 * @return the mobile
 */
public long getMobile() {
	return mobile;
}
/**
 * @param mobile the mobile to set
 */
public void setMobile(long mobile) {
	this.mobile = mobile;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * @return the gender
 */
public String getGender() {
	return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
}
/**
 * @return the dob
 */
public Date getDob() {
	return dob;
}
/**
 * @param dob the dob to set
 */
public void setDob(Date dob) {
	this.dob = dob;
}
	
}
