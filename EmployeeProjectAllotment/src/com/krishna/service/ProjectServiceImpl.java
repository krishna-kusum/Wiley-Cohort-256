package com.krishna.service;

import java.util.List;

import com.krishna.bean.Project;
import com.krishna.persistence.ProjectDaoImpl;

public class ProjectServiceImpl implements ProjectService {
	
	@Override
	public Project searchProjectById(int id) {
		ProjectDaoImpl projectDao = new ProjectDaoImpl();
		return projectDao.searchRecordById(id);
	}

	@Override
	public List<Project> getProjects() {
		ProjectDaoImpl projectDao = new ProjectDaoImpl();
		return projectDao.getRecords();
	}
	
}
