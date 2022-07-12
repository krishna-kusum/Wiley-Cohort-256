package com.krishna.persistence;

import java.util.List;

import com.krishna.bean.Employee;
import com.krishna.database.EmployeeDataSource;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public Employee searchRecordById(int id) {
		List<Employee> employees = EmployeeDataSource.getEmployeeList();
		for(Employee employee: employees) {
			if(id == employee.getEmpId()) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public List<Employee> getRecords() {
		return EmployeeDataSource.getEmployeeList();
	}
}