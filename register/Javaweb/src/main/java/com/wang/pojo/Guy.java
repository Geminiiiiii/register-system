package com.wang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Guy {

  private long userId;
  private String learn;
  private String ation;
  private String vaccine;
  private String own;
  private String expect;
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public String getLearn() {
	return learn;
}
public void setLearn(String learn) {
	this.learn = learn;
}
public String getAtion() {
	return ation;
}
public void setAtion(String ation) {
	this.ation = ation;
}
public String getVaccine() {
	return vaccine;
}
public void setVaccine(String vaccine) {
	this.vaccine = vaccine;
}
public String getOwn() {
	return own;
}
public void setOwn(String own) {
	this.own = own;
}
public String getExpect() {
	return expect;
}
public void setExpect(String expect) {
	this.expect = expect;
}
public Guy(long userId, String learn, String ation, String vaccine, String own, String expect) {
	super();
	this.userId = userId;
	this.learn = learn;
	this.ation = ation;
	this.vaccine = vaccine;
	this.own = own;
	this.expect = expect;
}
public Guy() {
	super();
	// TODO Auto-generated constructor stub
}



}
