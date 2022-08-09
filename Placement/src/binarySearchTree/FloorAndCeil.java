package binarySearchTree;

public class FloorAndCeil {

	public static void main(String[] args) {
		Node first = new Node(40);
		first.left = new Node(20);
		first.right = new Node(60);
		first.left.left = new Node(10);
		first.left.right = new Node(30);
		System.out.println(findFloor(first,60));
		System.out.println(findCeil(first,60));
	}
	
	static int findFloor(Node root, int key) {
		int ans = Integer.MAX_VALUE;
		while(root != null) {
			if(root.value == key) return root.value;
			
			if(root.value > key) {
				root = root.left;
			}
			
			else if(root.value < key) {
				ans = root.value;
				root = root.right;
			}
		}
		return ans;
	}
	
	static int findCeil(Node root, int key) {
		int ans = Integer.MIN_VALUE;
		while(root != null) {
			if(root.value == key) return root.value;
			
			if(root.value > key) {
				ans = root.value;
				root = root.left;
			}else {
				root = root.right;
			}
		}
		return ans;
	}

}
