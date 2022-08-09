package binaryTree;

class BalancedPair{
	int height;
	boolean balanced;
}

public class Balanced {

	public static void main(String[] args) {
		//Test case I
		Node first = new Node(2);
		first.left = new Node(4);
		first.left.left = new Node(7);
		first.right = new Node(1);
		first.right.left = new Node(8);
		first.right.right = new Node(3);
		//Test case II
//        Node tree = new Node(1);
//        tree.left = new Node(2);
//        tree.right = new Node(3);
//        tree.left.left = new Node(4);
//        tree.left.left.right = new Node(8);
		
//		System.out.println(isBalanced(first));
		
		System.out.println(checkBalance(first).balanced);
	}
	
	static boolean isBalanced(Node root) {   //TC:O(n^2)
		if(root == null) return true;
		int lh = findHeight(root.left);
		int rh = findHeight(root.right);
		if(isBalanced(root.left) == true && isBalanced(root.right) == true && Math.abs(lh - rh) <= 1) return true;
		return false;
	}
	
	static int findHeight(Node root) {
		if(root == null) return 0;
		return Math.max(findHeight(root.left), findHeight(root.right))+1;
	}
	
	static BalancedPair checkBalance(Node root) {   //TC: O(n)
		     //SC: O(n)
		if(root == null) {
			BalancedPair random = new BalancedPair();
			random.height = 0;
			random.balanced = true;
			return random;
		}
		BalancedPair res = new BalancedPair(); 
		BalancedPair right = checkBalance(root.right);
		BalancedPair left = checkBalance(root.left);
		res.height = Math.max(left.height, right.height) + 1;
		int heightDiff = Math.abs(right.height - left.height);
		if(heightDiff <= 1 && left.balanced && right.balanced) res.balanced = true;
		else res.balanced = false;
		return res;
	}

}
