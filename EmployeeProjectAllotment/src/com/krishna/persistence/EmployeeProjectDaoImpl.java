package com.krishna.persistence;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.krishna.bean.Employee;
import com.krishna.bean.Project;
import com.krishna.database.EmployeeProjectDataSource;

public class EmployeeProjectDaoImpl implements EmployeeProjectDao{

	@Override
	public boolean allocateEmployeeToProject(int projectId, int empId) {
		// TODO Auto-generated method stub
		ProjectDaoImpl projectDao = new ProjectDaoImpl();
		EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
		if(projectDao.searchRecordById(projectId) != null && employeeDao.searchRecordById(empId) != null) {
			
			Employee emp = employeeDao.searchRecordById(empId);
			
			Map<Project,HashSet<Employee>> empProjectDatabase = EmployeeProjectDataSource.getEmpProjectDatabase();
			
			Set<Project> projects = empProjectDatabase.keySet();
			
			for(Project project_ : projects) {
				if(project_.getProjectId() == projectId) {
					empProjectDatabase.get(project_).add(emp);
					return true;
				}
			}
			Project project = projectDao.searchRecordById(projectId);
			HashSet<Employee> employees = new HashSet<>();
			employees.add(emp);
			empProjectDatabase.put(project,employees);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean deallocateEmployeeFromProject(int projectId,int empId) {
		ProjectDaoImpl projectDao = new ProjectDaoImpl();
		EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
		
		if(projectDao.searchRecordById(projectId) != null && employeeDao.searchRecordById(empId) != null) {
			
			Employee emp = employeeDao.searchRecordById(empId);
			
			Map<Project,HashSet<Employee>> empProjectDatabase = EmployeeProjectDataSource.getEmpProjectDatabase();
			
			Set<Project> projects = empProjectDatabase.keySet();
			
			for(Project project_ : projects) {
				if(project_.getProjectId() == projectId) {
					if(empProjectDatabase.get(project_).contains(emp)) {
						empProjectDatabase.get(project_).remove(emp);
						return true;
					}
				}
			}
			
			return false;
		}
		
		
		return false;
	}

}
