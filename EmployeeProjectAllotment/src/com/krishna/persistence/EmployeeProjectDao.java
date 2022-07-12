package com.krishna.persistence;

public interface EmployeeProjectDao {
	
	boolean allocateEmployeeToProject(int projectId, int empId); 
	boolean deallocateEmployeeFromProject(int projectId,int empId);

}
