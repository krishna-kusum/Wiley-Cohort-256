package com.krishna.singlylinkedlist;

public class LinkedList {

	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	Node head;
	
	
	public void insertElement(int data) {
		Node newNode=new Node(data);
		
		//if list is blank
		if(head==null) {
			head=newNode;
		}
		else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
		
	}
	
	public void insertNode(int data) {
		
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
		}
		else if(head.data>data) {
			newNode.next = head;
			head = newNode;
		}else {
			Node temp = head;
			while(temp.next!=null && temp.next.data<data) {
				temp = temp.next;
			}
			
			newNode.next = temp.next;
			
			temp.next = newNode;
			
		}
		
		
		
	}
	
	
	
	public boolean deleteElement(int data) {
		
		Node temp = head;
		Node prev = null;
		
//		if deleting head
		if(head.data == data) {
			head = temp.next;
			return true;
		}
		
		
		while(temp != null && temp.data != data) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null) {
			return false;
		}
		
		prev.next = temp.next;
		return false;
		
	}
	
	public void displayList() {
		Node currentNode=head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
	
	void displayReverseUtil(Node node) {
		if(node == null)
			return;
		
		displayReverseUtil(node.next);
		
		System.out.print(node.data + " ");
	}
	
	public void displayReverse() {
		displayReverseUtil(head);
	}
}

