package com.krishna.persistence;

import java.util.List;

import com.krishna.bean.Project;
import com.krishna.database.ProjectDataSource;

public class ProjectDaoImpl implements ProjectDao {
	
	public Project searchRecordById(int id) {
		List<Project> projects = ProjectDataSource.getProjectList();
		for(Project project: projects) {
			if(id == project.getProjectId()) {
				return project;
			}
		}
		return null;
	}

	public List<Project> getRecords() {
		return ProjectDataSource.getProjectList();
	}

}
