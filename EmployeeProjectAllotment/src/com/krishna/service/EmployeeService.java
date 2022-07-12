package com.krishna.service;

import java.util.List;

import com.krishna.bean.Employee;

public interface EmployeeService {
	
	Employee searchEmployeeById(int id);
	List<Employee> getEmployees();

}
