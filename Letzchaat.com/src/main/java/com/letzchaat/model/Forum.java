package com.letzchaat.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Forum implements Serializable {


@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="forumid")	
private int id;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "userid")
private int owner;
private String topic; 

/**
 * @return the owner
 */
public int getOwner() {
	return owner;
}
/**
 * @param owner the owner to set
 */
public void setOwner(int owner) {
	this.owner = owner;
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
/**
 * @return the owner
 */
public int getGroupowner() {
	return owner;
}
/**
 * @param owner the owner to set
 */
public void setGroupowner(int owner) {
	this.owner = owner;
}

	
	
	
	
}
