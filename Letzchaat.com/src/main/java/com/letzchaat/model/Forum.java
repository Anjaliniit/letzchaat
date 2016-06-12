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

@Entity
public class Forum implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="forumid")	
private int id;
@ManyToOne
@JoinColumn(name = "userid")
private UserRegister user;
private String topic; 

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
public Forum(){}
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
