package com.krishna.queueusinglinkedlist;

import java.util.Scanner;

public class QueueImplementationMain {
	
	private GenericQueue<Integer> queue = new GenericQueue<>();
	
	public static void main(String[] args) {
		
		QueueImplementationMain stackImplementation = new QueueImplementationMain();
		
		while(true) {
			stackImplementation.showMenu();
			stackImplementation.performMenu();
			
		}

	}
	
	void showMenu() {
		System.out.println("Choose operation to perform on queue:");
		System.out.println("Choose 1 to enqueue.");
		System.out.println("Choose 2 to dequeue.");
		System.out.println("Press any other key to exit.");
	}
	
	void performMenu() {
		Scanner sc = new Scanner(System.in);
		Integer choice = sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter the data to enqueue : ");
			int value = sc.nextInt();
			queue.enqueue(value);
			System.out.println(value + " enqueued to queue successfully.\n");
			break;
		
		case 2:
			Integer poppedValue = queue.dequeue();
			if(poppedValue == null) {
				System.out.println("Queue is empty.");
			}else {
				System.out.println("The dequeued value is : " + poppedValue);
			}
			break;
			
		default :
			System.out.println("============Thank you for Using Queue Implementation =================");
			System.exit(0);
		}
	}

}
