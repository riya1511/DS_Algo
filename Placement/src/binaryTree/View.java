package binaryTree;

import java.util.ArrayList;

public class View {

	public static void main(String[] args) {
		Node first = new Node(4);
		first.left = new Node(3);
		first.left.left = new Node(2);
		first.left.right = new Node(1);
		first.left.right.left = new Node(6);
		first.left.right.right = new Node(7);
		first.right = new Node(5);
		System.out.println("Left view of the biinary tree - ");
		printLeftView(first);
		System.out.println();
		System.out.println("Right view of the binary tree - ");
		printRightView(first);
	}
	
	//***************************Left view***********************************
	
	static void printLeftView(Node root) {
		ArrayList<Node> list = new ArrayList<>();
		leftView(list,root,1);
		for(Node curr: list) {
			System.out.print(curr.value + " ");
		}
		
	}
	
	static int max_level_left = 0;
	
	static void leftView(ArrayList<Node> l, Node root, int level) {
		if(root == null) return;
		if(max_level_left < level) {
			l.add(root);
			max_level_left = level;
		}
		leftView(l,root.left,level+1);
		leftView(l,root.right,level+1);
	}
	
	//***************************Right view***********************************
	
	static void printRightView(Node root) {
		ArrayList<Node> list = new ArrayList<>();
		rightView(list,root,1);
		for(Node curr: list) {
			System.out.print(curr.value + " ");
		}
		
	}
	
	static int max_level_right = 0;
	
	static void rightView(ArrayList<Node> l, Node root, int level) {
		if(root == null) return;
		if(max_level_right < level) {
			l.add(root);
			max_level_right = level;
		}
		rightView(l,root.right,level+1);
		rightView(l,root.left,level+1);
	}

}
