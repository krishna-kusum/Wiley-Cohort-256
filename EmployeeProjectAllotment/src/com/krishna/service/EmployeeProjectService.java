package com.krishna.service;

public interface EmployeeProjectService {
	
	boolean allocateEmployeeToProject(int projectId, int EmpId);
	boolean deallocateEmployeeFromProject(int projectId, int EmpId);

}
