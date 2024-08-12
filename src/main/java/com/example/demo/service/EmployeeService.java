package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeService {

	private ArrayList<Employee> employee;

	public String addEmployee(Employee employee2) {
		if(employee==null) {
			employee=new ArrayList<Employee>();
		}

		for(Employee emp:employee) {
			System.out.println(emp);
			if(emp.getEmployeeId()==employee2.getEmployeeId()) {
				System.out.println(employee2);
				return "Employee Already Register in the DataBase";
			}
		}
		employee.add(employee2);
		return "Employee Register Successfully";
	}

	public Employee findEmployeeById(int employeeId) {
		for(Employee emp:employee) {
			System.out.println(emp);
			if(emp.getEmployeeId()==employeeId)
				return emp;
		}
		return null;
	}

	public Employee updateEmployeeById(int employeeId, Employee employee2) {
		
		for(Employee emp:employee) {
			if(emp.getEmployeeId()==employeeId) {
				emp.setEmployeeName(employee2.getEmployeeName());
				emp.setSalary(employee2.getSalary());
				return emp;
			}
		}
		return null;
	}

	public Employee deleteEmployee(int employeeId) {
		Employee e1 = null;
		for(Employee emp:employee) {
			if(emp.getEmployeeId()==employeeId) {
				e1=emp;
			}
		}		
		employee.remove(e1);
		return e1;
	}

	public List<Employee> findAllEmployees() {
		
		return employee;
	}



}
