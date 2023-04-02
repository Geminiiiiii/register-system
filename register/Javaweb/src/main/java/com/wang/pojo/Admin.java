package com.wang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Admin {

  private long id;
  private String name;
  private String pass;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public Admin(long id, String name, String pass) {
	super();
	this.id = id;
	this.name = name;
	this.pass = pass;
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}



}
