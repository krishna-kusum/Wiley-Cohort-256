package com.krishna.demo;

public class BinarySearchTree{
	
	class Node{
		WordFrequencyClass key;
		Node left;
		Node right;
		public Node(WordFrequencyClass key) {
			this.key = key;
		}
	}

	Node root;
	
	public void insert(WordFrequencyClass key) {
		root=insertRec(root, key);
	}
	private Node insertRec(Node root, WordFrequencyClass key) {
		//if the tree is empty
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key.getWord().compareTo(root.key.getWord())<0)
			root.left=insertRec(root.left, key);
		else if(key.getWord().compareTo(root.key.getWord())>0)
			root.right=insertRec(root.right, key);
		else {
			root.key.setFrequency(root.key.getFrequency()+1);
		}
		return root;
	}

	public void inorderTraversal() {
		inorderRec(root);
	}
	
	//Left,root,right
	private void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
	
}
