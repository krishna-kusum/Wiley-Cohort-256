package com.krishna.database;

import java.util.Map;
import java.util.Set;

import com.krishna.bean.Employee;
import com.krishna.bean.Project;

import lombok.Data;

import java.util.HashMap;
import java.util.HashSet;


@Data
public class EmployeeProjectDataSource {
	
	private static Map<Project,HashSet<Employee>> empProjectDatabase = new HashMap<Project,HashSet<Employee>>();

	public static Map<Project, HashSet<Employee>> getEmpProjectDatabase() {
		return empProjectDatabase;
	}

	public static void setEmpProjectDatabase(Map<Project, HashSet<Employee>> empProjectDatabase) {
		EmployeeProjectDataSource.empProjectDatabase = empProjectDatabase;
	}

	public static void displayEmployeeProjects() {
		// TODO Auto-generated method stub
		Set<Project> projects = empProjectDatabase.keySet();
		for (Project project : projects) {
			System.out.println(project + " : " + empProjectDatabase.get(project));
		}
		
	}
	

}
