package binaryTree;

public class FlattenTree {

	public static void main(String[] args) {
		Node first = new Node(3);
		first.left = new Node(5);
		first.right = new Node(2);
		first.right.left = new Node(1);
		first.right.left.left = new Node(4);
		first.right.left.right = new Node(6);
		convertToLL(first);
		printList();
	}
	
	static Node prev,head;
	
	static void convertToLL(Node root) {
		if(root == null) return;
		convertToLL(root.left);
		if(prev == null) head = root;
		else {
			root.left = prev;
			prev.right = root;
		}
		prev = root;
		convertToLL(root.right);
	}
	
	static void printList()
	{
	    while (head != null) {
	        System.out.print(head.value+ " ");
	        head = head.right;
	    }
	}

}
