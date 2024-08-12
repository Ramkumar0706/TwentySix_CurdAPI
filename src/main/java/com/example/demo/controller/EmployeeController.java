package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@PostMapping("/addEmployee")	
	public String addEmplyee(@RequestBody Employee employee) {
		return  service.addEmployee(employee);
	}

	@GetMapping("/employee/{employeeId}")
	public Employee findEmployeeById(@PathVariable int employeeId) {
		return service.findEmployeeById(employeeId);
	}
	
	@PutMapping("/employees/{employeeId}/updateEmployee")
	public Employee updateEmployeeById(@PathVariable int employeeId,@RequestBody Employee employee) {
		return service.updateEmployeeById(employeeId,employee);
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public Employee deleteEmployee(@PathVariable int employeeId) {
		return service.deleteEmployee(employeeId);
	}
	
	@GetMapping("/allEmployees")
	public List<Employee> findAllEmployees(){
		return service.findAllEmployees();
	}

}
