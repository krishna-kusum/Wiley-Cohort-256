package com.krishna.doublylinkedlist;

public class DoublyLinkedList {
	
	public class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	Node head;
	
	public void insertElement(int value) {
		
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
		}else {
			
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			
			newNode.prev = temp;
			temp.next = newNode;
		}
	}
	
	public boolean deleteElement(int data) {
		
		if(head == null) {
			System.out.println("LinkedList is empty.");
			return false;
		}
		else {
			Node temp = head;
			Node prevNode = null;
			
			if(head.data == data) {
				head = head.next;
				return true;
			}
			
			while(temp!= null && temp.data != data) {
				prevNode = temp;
				temp = temp.next;
				if(temp != null) {
					temp.prev = prevNode;
					prevNode.next = temp;
				}
			}
			
			if(temp == null) {
				System.out.println(data + " does not exists.");
				return false;
			}
			
			prevNode.next = temp.next;
			
			return true;
		}
	}
	
	public void displayElements() {
		if(head == null) {
			System.out.println("Doubly linked list is empty.");
		}else {
			Node temp = head;
			
			while(temp != null) {
				System.out.print(temp.data +" ");
				temp = temp.next;
			}
		}
	}

}
