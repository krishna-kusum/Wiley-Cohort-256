package com.krishna.persistence;

import java.util.List;

import com.krishna.bean.Employee;

public interface EmployeeDao {
	Employee searchRecordById(int id);
	List<Employee> getRecords();
}
