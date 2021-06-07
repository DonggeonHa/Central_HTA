package com.sample.school.vo;

import java.util.Date;

public class Course {

	private int no;
	private String name;
	private String type;
	private int quota;
	private int year;
	private int term;
	private String room;
	private String building;
	private String available;
	private int registeredCount;
	private int professorNo;
	private int departmentNo;
	private Date createdDate;
	
	public Course() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuota() {
		return quota;
	}

	public void setQuota(int quota) {
		this.quota = quota;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getTerm() {
		return term;
	}
	
	public void setTerm(int term) {
		this.term = term;
	}
	
	public String getRoom() {
		return room;
	}
	
	public void setRoom(String room) {
		this.room = room;
	}
	
	public String getBuilding() {
		return building;
	}
	
	public void setBuilding(String building) {
		this.building = building;
	}
	
	public String getAvailable() {
		return available;
	}
	
	public void setAvailable(String available) {
		this.available = available;
	}

	public int getRegisteredCount() {
		return registeredCount;
	}

	public void setRegisteredCount(int registeredCount) {
		this.registeredCount = registeredCount;
	}

	public int getProfessorNo() {
		return professorNo;
	}

	public void setProfessorNo(int professorNo) {
		this.professorNo = professorNo;
	}

	public int getDepartmentNo() {
		return departmentNo;
	}
	
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
