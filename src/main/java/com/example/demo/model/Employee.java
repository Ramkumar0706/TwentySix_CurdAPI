package com.example.demo.model;

public class Employee {
	
	
	private int employeeId;
	private String employeeName;
	private int salary;
	
	public Employee(int employeeId, String employeeName, int salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	
	
}
