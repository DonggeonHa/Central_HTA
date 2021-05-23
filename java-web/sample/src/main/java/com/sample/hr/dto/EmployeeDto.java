package com.sample.hr.dto;

public class EmployeeDto {

	private int managerId;
	private String managerName;
	
	public EmployeeDto() {}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	
}
