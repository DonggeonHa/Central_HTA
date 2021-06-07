package com.sample.school.vo;

public class LoginUser {

	// 로그인한 학생번호 혹은 교수번호가 대입된다.
	private int no;
	private String name;
	// 로그인한 회원이 학생이면 student, 교수면 professor이 대입된다.
	private String userType;
	private int departmentNo;
	
	public LoginUser() {}

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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	
}
