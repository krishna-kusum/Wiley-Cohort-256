package com.krishna.service;

import java.util.List;

import com.krishna.bean.Project;

public interface ProjectService {
	Project searchProjectById(int id);
	List<Project> getProjects();
	
}
