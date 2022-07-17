package com.krishna.stack;


public class GenericStack<T> {
	
	public class Node{
		T data;
		Node prev;
		public Node(T data) {
			super();
			this.data = data;
			this.prev = null;
		}
	}
	
	Node top;
	Node head;
	
	public void push(T data) {
		Node newNode=new Node(data);
		
		if(top==null) {
			top=newNode;
		}
		else {
			
			newNode.prev = top;
			top = newNode;
		}
		
	}
	
	public T pop() {
		
		if(top==null) {
//			System.out.println("Stack is Empty");
			return null;
		}else {
			T value = top.data;
			top = top.prev;
			return value;
		}
		
		
	}

}
