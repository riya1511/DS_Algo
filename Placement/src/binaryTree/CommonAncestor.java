package binaryTree;

public class CommonAncestor {

	public static void main(String[] args) {
		Node first = new Node(5);
		first.right = new Node(3);
		first.left = new Node(2);
		first.left.left = new Node(4);
		first.left.left.right = new Node(1);
		first.left.left.right.left = new Node(7);
		first.left.left.right.right = new Node(6);
		System.out.println("The lowest common ancestor of node 4 and 6 is: " + lowestCA(first,4,6).value);
	}
	
	static Node lowestCA(Node root, int a, int b) {
		if(root == null) return null;
		if(root.value == a || root.value == b) return root;
		
		Node left = lowestCA(root.left,a,b);
		Node right = lowestCA(root.right,a,b);
		if(left == null) return right;
		if(right == null) return left;
		
		return root;
	}

}
