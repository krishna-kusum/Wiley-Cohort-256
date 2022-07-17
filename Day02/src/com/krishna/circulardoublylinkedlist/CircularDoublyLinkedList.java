package com.krishna.circulardoublylinkedlist;

public class CircularDoublyLinkedList {

	public class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}

	Node head;

	public void insertElement(int value) {

		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
			newNode.next = newNode.prev = newNode;
		} else  {

//			Node temp = head;

//			while(temp.next != null && temp.next != head) {
//				temp = temp.next;
//			}
//			
//			newNode.prev = temp;
//			temp.next = newNode;
//			
//			head.prev = newNode;
//			newNode.next = head;

			Node last = head.prev;

			last.next = newNode;
			newNode.prev = last;

			newNode.next = head;
			head.prev = newNode;
		}
	}

	public boolean deleteElement(int data) {

		if (head == null) {
			System.out.println("LinkedList is empty.");
			return false;
		} 

			Node current = head.next;
			Node prevNode = null;

			if (head.data == data) {
				prevNode = head;

				head = head.next;

				head.prev = prevNode.prev;
				head.prev.next = head;

				return true;
			}

			Node last = head.prev;

			if (last.data == data) {
				last.prev.next = head;
				head.prev = last.prev;
				return true;
			}

			
			  while(current.data != data) { 
				  
				  if(current == head) {
					  System.out.println("Element does not exist");
					  return false;
				  }
				  
				  prevNode = current; 
				  current = current.next;
				  if(current != null) { 
					  current.prev = prevNode; prevNode.next = current; 
				  } 
				  
			  }
			  
				  if(current.next == head) {
					  prevNode.next = head;
					  head.prev = prevNode;
				  }else {
					  Node temp = current.next;
					  prevNode.next = temp;
					  temp.prev = prevNode;
				  }
			  
			  
			return true;
		
	}

	public void displayElements() {
		if (head == null) {
			System.out.print("Doubly linked list is empty.");
		} else {
			System.out.print(head.data + " ");
			Node temp = head.next;

			while (temp!= head) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}

}
