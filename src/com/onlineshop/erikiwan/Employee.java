package com.onlineshop.erikiwan;

public class Employee extends Account {
	private String employeeId;
	private String salary;
	private String shift;
	
	public Employee(String employeeId, String salary, String shift) {
		super("#id", "example@gmail.com", "example");
		this.employeeId = employeeId;
		this.salary = salary;
		this.shift = shift;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	
}
