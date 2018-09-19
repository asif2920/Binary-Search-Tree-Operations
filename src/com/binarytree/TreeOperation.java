package com.binarytree;
/**
 * 
 * @author asif
 * 
 * This class is an implementation for binary search tree
 * Formulate the tree for a certain input
 * Do basic operation: pre order, post order and in order
 * Searching elements from the tree
 */
public class TreeOperation {

	public void start() {
		run();	
	}

	public void run() {
       Node node=new Node(12);
		
		System.out.println("Root value is: "+node.value);
		//inserting element to the tree
		insert(node,8);
		insert(node,3);
		insert(node,13);
		insert(node,20);
		insert(node,9);
		insert(node,12);
		insert(node,10);
		insert(node,16);
		// Implement In order traversal
		System.out.println("In order traversal: ");
		printInOrderTraversal(node);
		System.out.println("");
		// Implementation of Pre order traversal
		System.out.println("Pre order traversal: ");
		printPreOrderTraversal(node);
		System.out.println("");
		//Implementation of post order traversal
		System.out.println(" Post order traversal: ");
		printPostOrderTraversal(node);
		System.out.println("");
		System.out.println(" Search for an element: ");
		search(node, 30);
		
	}
	/**
	 * Search for the number
	 * @param node
	 * @param value
	 */
	private void search(Node node, int value) {
		if(node == null) {
			System.out.println(" The number doesn't exist");
		}else if(node.value == value) {
			System.out.println(" Found the number");
		}else {
			if(value < node.value) {
				search(node.left, value);
			}else {
				search(node.right, value);
			}
		}
		
	}
/**
 * Implementation of post order traversal
 * @param node
 */
	private void printPostOrderTraversal(Node node) {
		if(node != null) {
			printPostOrderTraversal(node.left);
			printPostOrderTraversal(node.right);
			System.out.print(node.value);
			System.out.print(" ");
		}
		
	}
/**
 * Implementation of pre order traversal
 * @param node
 */
	private void printPreOrderTraversal(Node node) {
		if(node !=null) {			
			System.out.print(node.value);
			System.out.print(" ");
			printPreOrderTraversal(node.left);
			printPreOrderTraversal(node.right);
		}
		
	}

	/**
	 * Implementation of in-order traversal
	 * @param node
	 */
     private void printInOrderTraversal(Node node) {
		if(node != null) {
			printInOrderTraversal(node.left);
			System.out.print(node.value);
			System.out.print(" ");
			printInOrderTraversal(node.right);
		}
		
	}

/**
 * Formation of tree is done here
 * @param node
 * @param value
 */
	public void insert(Node node, int value) {
		if(value < node.value) {
			if(node.left != null) {
				insert(node.left, value);
			}else {
				System.out.println("Inserted value is: "+value+" To the left of: "+node.value);
				node.left = new Node(value);
			}
		}else {
			if(node.right!=null) {
				insert(node.right, value);
			}else {
				System.out.println("Inserted value is: "+value+" To the right of: "+node.value);
				node.right = new Node(value);
			}
		}
		
	}

}
