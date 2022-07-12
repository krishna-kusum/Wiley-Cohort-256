package com.krishna.client;

import com.krishna.presentation.EmployeeProjectPresentationImpl;

public class Client {

	public static void main(String[] args) {
		
		EmployeeProjectPresentationImpl empi = new EmployeeProjectPresentationImpl();
		
		while(true) {
			empi.menu();
		}
	}

}
