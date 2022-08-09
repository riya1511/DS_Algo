package binarySearchTree;

class Node{
	Node left, right;
	int value;
	Node(int value){
		this.value = value;
	}
}

public class Operations {

	public static void main(String[] args) {
		Node first = new Node(20);
		first.left = new Node(10);
		first.right = new Node(30);
		first.right.left = new Node(25);
		first.right.right = new Node(35);
//		System.out.println(isPresent(first,39));
		print_tree(first);
		System.out.println();
		Node new_first = delete(first,25);
		print_tree(new_first);
	}
	
	static void print_tree(Node root) {
		if(root == null) return;
		System.out.print(root.value + " ");
		print_tree(root.left);
		print_tree(root.right);
	}
	
	static boolean isPresent(Node root, int key) {
		if(root == null) return false;
		
		if(root.value == key) return true;
		
		if(root.value > key) return isPresent(root.left,key);
		return isPresent(root.right,key);
	}
	
	//recursive
	static Node insertRec(Node root, int data) {    //TC: O(log(n))  SC:O(h)
		Node add = new Node(data);
		if(root == null) root = add;
		if(root.value < data) {
			root.right = insertRec(root.right,data);
		}
		if(root.value > data) {
			root.left = insertRec(root.left,data);
		}
		return root;
	}
	
	//iterative
	static Node insertIte(Node root, int data) { //TC: O(h)  SC:O(1)
		Node add = new Node(data);
		Node curr = root;
		Node parent = null;
		while(curr != null) {
			parent = curr;
			if(curr.value > data) {
				curr = curr.left;
			}else if(curr.value < data) {
				curr = curr.right;
			}
		}
		if(parent == null) {
			return add;
		}
		else if(parent.value > data) {
			parent.left = add;
		}
		else if(parent.value < data) {
			parent.right = add;
		}
		return root;
	}
	
	static Node delete(Node root, int key) {
		if(root == null) return root;
		if(key < root.value) {
			root.left = delete(root.left,key);
		}
		else if(key > root.value) {
			root.right = delete(root.right,key);
		}
		//found the root to be deleted
		else {
			if(root.left == null) return root.right;
			else if(root.right == null) return root.left;
			
			root.value = minValue(root.right);
			root.right = delete(root.right,root.value);
		}
		return root;
	}
	
	static int minValue(Node root) {
		int minv = root.value;
		while(root.left != null) {
			minv = root.left.value;
			root = root.left;
		}
		return minv;
	}

}
