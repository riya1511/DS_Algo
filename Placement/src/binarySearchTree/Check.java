package binarySearchTree;

public class Check {

	public static void main(String[] args) {
		Node first = new Node(10);
		first.left = new Node(8);
		first.right = new Node(20);
		first.left.left = new Node(6);
		first.left.left.left = new Node(4);
		first.left.left.right = new Node(9);
		System.out.println(isBST(first));
	}
	
	static boolean isBST(Node root) {
		return isBSTrange(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	static boolean isBSTrange(Node root, int min, int max) {   
		if(root == null) return true;
		
		if(root.value < min || root.value > max) {
			return false;
		}
		
		return isBSTrange(root.left,min,root.value-1) && isBSTrange(root.right,root.value+1,max); 
	}
	
	static Node prev = null;
	
	static boolean isBSTinorder(Node root) {
		if(root != null) {
			if(!isBSTinorder(root.left)) return false;
			
			if(prev != null && root.value <= prev.value) return false;
			
			prev = root;
			
			return isBSTinorder(root.right);
		}
		return true;
	}

}
