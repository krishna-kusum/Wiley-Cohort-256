package com.krishna.database;

import java.util.ArrayList;
import java.util.List;

import com.krishna.bean.Employee;

import lombok.Data;

@Data
public class EmployeeDataSource {
	 
	private static List<Employee> employeeList = new ArrayList<>();
	
	static {
		employeeList.add(new Employee(101,"AAAA"));
		employeeList.add(new Employee(102,"BBBB"));
		employeeList.add(new Employee(103,"CCCC"));
		employeeList.add(new Employee(104,"DDDD"));
		employeeList.add(new Employee(105,"EEEE"));
		employeeList.add(new Employee(106,"FFFF"));
		employeeList.add(new Employee(107,"GGGG"));
		employeeList.add(new Employee(108,"HHHH"));
		employeeList.add(new Employee(109,"IIII"));
		employeeList.add(new Employee(110,"JJJJ"));
	}

	public static List<Employee> getEmployeeList() {
		return employeeList;
	}

	public static void setEmployeeList(List<Employee> employeeList) {
		EmployeeDataSource.employeeList = employeeList;
	}

//	public static List<Employee> getEmployeeList() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
