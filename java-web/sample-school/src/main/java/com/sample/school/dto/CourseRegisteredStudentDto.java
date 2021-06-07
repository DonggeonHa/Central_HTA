package com.sample.school.dto;

import java.util.Date;

public class CourseRegisteredStudentDto {

	private int courseNo;
	private int id;					// 학생아이디
	private String name;			// 학생이름
	private int grade;				// 학생학년
	private int departmentNo;		// 소속학과번호
	private String departmentName;	// 소속학과이름
	private String courseStatus;	// 과정등록상태
	private String coursePassed;	// 수료여부
	private int courseScore;		// 점수
	private String courseGrade;		// 성적
	private Date createdDate;		// 수강신청등록일
	
	public CourseRegisteredStudentDto() {}

	public int getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	public String getCoursePassed() {
		return coursePassed;
	}

	public void setCoursePassed(String coursePassed) {
		this.coursePassed = coursePassed;
	}

	public int getCourseScore() {
		return courseScore;
	}

	public void setCourseScore(int courseScore) {
		this.courseScore = courseScore;
	}

	public String getCourseGrade() {
		return courseGrade;
	}

	public void setCourseGrade(String courseGrade) {
		this.courseGrade = courseGrade;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
