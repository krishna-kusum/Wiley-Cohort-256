package com.krishna.persistence;

import java.util.List;

import com.krishna.bean.Project;

public interface ProjectDao {
	Project searchRecordById(int id);
	List<Project> getRecords();

}
