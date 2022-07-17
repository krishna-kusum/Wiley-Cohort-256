package com.krishna.circulardoublylinkedlist;

public class CircularDoublyLinkedListMain {
	
	public static void main(String[] args) {
		
		CircularDoublyLinkedList doublyLinkedList = new CircularDoublyLinkedList();
		
		doublyLinkedList.insertElement(10);
		doublyLinkedList.insertElement(15);
		doublyLinkedList.insertElement(7);
		doublyLinkedList.insertElement(48);
		doublyLinkedList.insertElement(39);
		doublyLinkedList.insertElement(23);
		
		doublyLinkedList.displayElements();
		doublyLinkedList.deleteElement(48);
		doublyLinkedList.deleteElement(10);
		doublyLinkedList.deleteElement(23);
		doublyLinkedList.deleteElement(51);
		System.out.println("\n");
		doublyLinkedList.displayElements();
	}

}
