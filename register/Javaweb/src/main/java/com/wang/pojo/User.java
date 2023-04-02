package com.wang.pojo;


import java.util.Date;


public class User {

  private long id;
  private long ic;
  private Date date;
  private String program;
  private Guy guy;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public long getIc() {
	return ic;
}
public void setIc(long ic) {
	this.ic = ic;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getProgram() {
	return program;
}
public void setProgram(String program) {
	this.program = program;
}
public Guy getGuy() {
	return guy;
}
public void setGuy(Guy guy) {
	this.guy = guy;
}
public User(long id, long ic, Date date, String program, Guy guy) {
	super();
	this.id = id;
	this.ic = ic;
	this.date = date;
	this.program = program;
	this.guy = guy;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}


}
