package com.krishna.queueusinglinkedlist;

import com.krishna.stack.GenericStack.Node;

public class GenericQueue<T> {
			
		public class Node{
			T data;
			Node next;
			public Node(T data) {
				super();
				this.data = data;
				this.next = null;
			}
		}
		
		Node front;
		Node rear;
		
		public void enqueue(T data) {
			Node newNode=new Node(data);
			
			if(rear==null) {
				front = rear =newNode;
			}
			else {
				
				rear.next = newNode;
				rear = newNode;
			}
			
		}
		
		public T dequeue() {
			
			if(front == null) {
				return null;
			} 
			
			Node newNode = front;
			front = front.next;
			
			return newNode.data;
			
		}
		
}
