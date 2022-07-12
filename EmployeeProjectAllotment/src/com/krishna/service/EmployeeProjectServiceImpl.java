package com.krishna.service;

import com.krishna.persistence.EmployeeProjectDaoImpl;

public class EmployeeProjectServiceImpl implements EmployeeProjectService{

	@Override
	public boolean allocateEmployeeToProject(int projectId, int EmpId) {

		EmployeeProjectDaoImpl empdi = new EmployeeProjectDaoImpl();
		return empdi.allocateEmployeeToProject(projectId, EmpId);
	}

	@Override
	public boolean deallocateEmployeeFromProject(int projectId, int EmpId) {
		EmployeeProjectDaoImpl empdi = new EmployeeProjectDaoImpl();
		return empdi.deallocateEmployeeFromProject(projectId, EmpId);	
	}

}
