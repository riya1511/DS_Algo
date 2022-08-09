package binaryTree;

public class Traversal {

	public static void main(String[] args) {
		Node first = new Node(2);
		first.left = new Node(4);
		first.left.left = new Node(7);
		first.right = new Node(1);
		first.right.left = new Node(8);
		first.right.right = new Node(3);
		System.out.println("Inorder traversal of tree");
		inOrder(first);
		System.out.println();
		System.out.println("Preorder traversal of tree");
		preOrder(first);
		System.out.println();
		System.out.println("Postorder traversal of tree");
		postOrder(first);
	}
	
	static void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.value + " ");
		inOrder(root.right);
	}
	
	static void preOrder(Node root) {
		if(root == null) return;
		System.out.print(root.value + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	static void postOrder(Node root) {
		if(root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.value + " ");
	}
}
