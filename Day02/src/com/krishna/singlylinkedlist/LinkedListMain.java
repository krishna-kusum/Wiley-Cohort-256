package com.krishna.singlylinkedlist;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		LinkedList linkedList=new LinkedList();
		int ch=1;
		while(ch!=0) {
			System.out.println("Enter element : ");
			linkedList.insertNode(scanner.nextInt());
			System.out.println("Do you want to add more elements press 0 for no and 1 for yes: ");
			ch=scanner.nextInt();
		}
		
//		linkedList.displayReverse();
		
		System.out.println("Enter Data to be deleted : ");
		int value = scanner.nextInt();
		
		if(linkedList.deleteElement(value)) {
			System.out.println("Data Deleted Successfully!");
		}else {
			System.out.println("Unable to delete data. Data doen't exist in the linked list.");
		}
		
		linkedList.displayList();
		scanner.close();

	}

}

//10
//23
//45
//35
//7
//5