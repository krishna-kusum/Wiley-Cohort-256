package com.krishna.service;

import java.util.List;

import com.krishna.bean.Employee;
import com.krishna.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	@Override
	public Employee searchEmployeeById(int id) {
		EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
		return employeeDao.searchRecordById(id);
	}

	@Override
	public List<Employee> getEmployees() {
		EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
		return employeeDao.getRecords();
	}
}
