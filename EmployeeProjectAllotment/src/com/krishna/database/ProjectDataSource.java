package com.krishna.database;

import java.util.ArrayList;
import java.util.List;

import com.krishna.bean.Project;

public class ProjectDataSource {
	
	private static List<Project> projectList = new ArrayList<>();
	
	static {
		projectList.add(new Project(1,"PPPP"));
		projectList.add(new Project(2,"QQQQ"));
		projectList.add(new Project(3,"RRRR"));
		projectList.add(new Project(4,"SSSS"));
	}

	public static List<Project> getProjectList() {
		return projectList;
	}

	public static void setProjectList(List<Project> projectList) {
		ProjectDataSource.projectList = projectList;
	}

}
