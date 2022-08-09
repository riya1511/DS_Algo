package binaryTree;
import binaryTree.Implementation;

class Dipair{
	int height;
	int diameter;
}

public class Diameter {

	public static void main(String[] args) {
		Node first = new Node(2);
		first.left = new Node(4);
		first.left.left = new Node(7);
		first.right = new Node(1);
		first.right.left = new Node(8);
		first.right.right = new Node(3);
		System.out.println("The diameter of the binary tree is: " + calculateDia(first));
		System.out.println(diameter(first).diameter);
	}
	
	static int calculateDia(Node root) {  //TC: O(n^2)
		if(root == null) return -1;
		int dl = calculateDia(root.left);  //diameter present in just left subtree
		int dr = calculateDia(root.right); //diameter present in just right subtree
		int droot = Implementation.findHeight(root.left) + Implementation.findHeight(root.right) + 1;
		return Math.max(droot, Math.max(dl,dr));
	}
	
	
	static Dipair diameter(Node root) {
		if(root == null) {
			Dipair d = new Dipair();
			d.height = -1;
			d.diameter = 0;
			return d;
		}
		Dipair left = diameter(root.left);
		Dipair right = diameter(root.right);
		Dipair res = new Dipair();
		res.height = Math.max(left.height, right.height) + 1;
		int ld = left.diameter;
		int rd = right.diameter;
		int rootd = ld + rd + 1;
		res.diameter = Math.max(Math.max(rd, ld), rootd);
		return res;
	}

}
