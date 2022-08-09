package binaryTree;

import java.util.Scanner;

class Node{
	Node left , right;
	int value;
	Node(int value){
		this.value = value;
	}
}

public class Implementation {

	static Scanner sc = null;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node first = createTree();
		System.out.println("Height of tree is: " + findHeight(first));
		System.out.println("Number of nodes in the tree is: " + noOfNodes(first));
		System.out.println("Maximum value of node in the tree is: " + maxNode(first));
		System.out.println("Minimum value of node in the tree is: " + minNode(first));
	}
	
	static Node createTree() {
		Node root = null;
		System.out.println("Enter data");
		int data = sc.nextInt();
		if(data == -1) return null;
		root = new Node(data);
		System.out.println("Enter left for " + data);
		root.left = createTree();
		System.out.println("Enter right for " + data);
		root.right = createTree();
		return root;
	}
	
	static int findHeight(Node root) {
		if(root == null) return 0;
		return Math.max(findHeight(root.left), findHeight(root.right))+1;
	}
	
	static int noOfNodes(Node root) {
		if(root == null) return 0;
		return noOfNodes(root.left)+noOfNodes(root.right)+1;
	}
	
	static int maxNode(Node root) {
		if(root == null) return Integer.MIN_VALUE;
		return Math.max(root.value, Math.max(maxNode(root.left), maxNode(root.right)));
	}
	
	static int minNode(Node root) {
		if(root == null) return Integer.MAX_VALUE;
		return Math.min(root.value, Math.min(minNode(root.left), minNode(root.right)));
	}

}
