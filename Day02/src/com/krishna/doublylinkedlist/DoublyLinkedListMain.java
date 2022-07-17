package com.krishna.doublylinkedlist;

public class DoublyLinkedListMain {
	
	public static void main(String[] args) {
		
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		
		doublyLinkedList.insertElement(10);
		doublyLinkedList.insertElement(15);
		doublyLinkedList.insertElement(7);
		doublyLinkedList.insertElement(48);
		doublyLinkedList.insertElement(39);
		doublyLinkedList.insertElement(23);
		
		doublyLinkedList.displayElements();
		System.out.println("\n");
		
		doublyLinkedList.deleteElement(48);
		doublyLinkedList.deleteElement(10);
		doublyLinkedList.deleteElement(23);
		doublyLinkedList.deleteElement(51);
		
		doublyLinkedList.displayElements();
	}

}

//10 15 7 48 39 23