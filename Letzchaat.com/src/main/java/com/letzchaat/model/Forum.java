package com.letzchaat.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Forum implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="forumid")	
private int id;
@NotEmpty(message="name can not be empty")
@Column(name="forumname")
private String name;

@ManyToOne
@JoinColumn(name ="userid")
private UserRegister user;
@NotEmpty(message="topic can not be empty")
private String topic; 

public Forum(){}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the user
 */
public UserRegister getUser() {
	return user;
}
/**
 * @param user the user to set
 */
public void setUser(UserRegister user) {
	this.user = user;
}

/**
 * @return the topic
 */
public String getTopic() {
	return topic;
}
/**
 * @param topic the topic to set
 */
public void setTopic(String topic) {
	this.topic = topic;
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
}
