package com.krishna.presentation;

import java.util.Scanner;

import com.krishna.database.EmployeeProjectDataSource;
import com.krishna.service.EmployeeProjectServiceImpl;

public class EmployeeProjectPresentationImpl implements EmployeeProjectPresentation {
	
	@Override
	public void menu() {
		System.out.println("\n--- EMPLOYEE PROJECT MANAGEMENT ---");
		System.out.println("1. Allocate employee to a project");
		System.out.println("2. Display employee and project details");
		System.out.println("3. Deallocate employee from a project");
		System.out.println("Press any other key to exit\n");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		menu(choice);
//		sc.close();
	}

	@Override
	public void menu(int choice) {
		Scanner sc = new Scanner(System.in);
		switch(choice) {
			case 1:
				System.out.println("Employee ID: ");
				int assignEmployeeId = sc.nextInt();
				System.out.println("Project ID: ");
				int assignProjectId = sc.nextInt();
				EmployeeProjectServiceImpl epsi1 = new EmployeeProjectServiceImpl();
				if(epsi1.allocateEmployeeToProject(assignProjectId, assignEmployeeId)) {
					System.out.println("Employee assigned to project");
				} else {
					System.out.println("Couldn't assign employee to project");
				}
				break;
			
			case 2:
				EmployeeProjectDataSource.displayEmployeeProjects();
				break;
			
			case 3:
				System.out.println("Employee ID: ");
				int deassignEmployeeId = sc.nextInt();
				System.out.println("Project ID: ");
				int deassignProjectId = sc.nextInt();
				EmployeeProjectServiceImpl epsi2 = new EmployeeProjectServiceImpl();
				if(epsi2.deallocateEmployeeFromProject(deassignProjectId, deassignEmployeeId)) {
					System.out.println("Employee deallocated from project");
				} else {
					System.out.println("Couldn't deallocate employee from project");
				}
				break;
			default:
				System.out.println("XXX EMPLOYEE PROJECT MANAGEMENT closed XXX");
				System.exit(0);
		}
	}
	
}
