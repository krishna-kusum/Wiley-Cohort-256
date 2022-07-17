package com.krishna.stack;

import java.util.Scanner;

public class StackImplementationMain {
	
	private GenericStack<Integer> stack = new GenericStack<>();
	
	public static void main(String[] args) {
		
		StackImplementationMain stackImplementation = new StackImplementationMain();
		
		while(true) {
			stackImplementation.showMenu();
			stackImplementation.performMenu();
			
		}

	}
	
	void showMenu() {
		System.out.println("Choose operation to perform on stack:");
		System.out.println("Choose 1 to push.");
		System.out.println("Choose 2 to pop.");
		System.out.println("Press any other key to exit.");
	}
	
	void performMenu() {
		Scanner sc = new Scanner(System.in);
		Integer choice = sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter the data to push : ");
			int value = sc.nextInt();
			stack.push(value);
			System.out.println(value + " pushed to stack successfully.\n");
			break;
		
		case 2:
			Integer poppedValue = stack.pop();
			if(poppedValue == null) {
				System.out.println("Stack is empty.");
			}else {
				System.out.println("The popped value is : " + poppedValue);
			}
			break;
			
		default :
			System.exit(0);
		}
	}

}
