package binaryTree;
import binaryTree.Implementation;
import java.util.*;

public class LevelOrder {

	public static void main(String[] args) {
		Node first = new Node(2);
		first.left = new Node(4);
		first.left.left = new Node(7);
		first.right = new Node(1);
		first.right.left = new Node(8);
		first.right.right = new Node(3);
		System.out.println("Brute force approach - ");
		for(int i = 1; i <= Implementation.findHeight(first); i++) {
			levelOrderTrav1(first,i);
		}
		System.out.println();
		System.out.println("Using queue - ");
		levelOrderTrav2(first);
		System.out.println();
		System.out.println("To print each level in new line using queue - ");
		levelOrderTrav3(first);
	}
	
	static void levelOrderTrav1(Node root, int level) {  //TC:O(n^2)
		if(root == null) return;
		if(level == 1)
			System.out.print(root.value + " ");
		else if(level > 1) {
			levelOrderTrav1(root.left,level-1);
			levelOrderTrav1(root.right,level-1);
		}
	}
	
	static void levelOrderTrav2(Node root) {   //TC:O(n) SC:O(n)
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node curr = q.poll();
			System.out.print(curr.value + " ");
			if(curr.left != null) {
				q.add(curr.left);
			}
			if(curr.right != null) {
				q.add(curr.right);
			}
		}
	}
	
	static void levelOrderTrav3(Node root) {   //TC:O(n) SC:O(n)
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node curr = q.poll();
			if(curr == null) {
				if(q.isEmpty()) return;
				q.add(null);
				System.out.println();
				continue;
			}
			System.out.print(curr.value + " ");
			if(curr.left != null) {
				q.add(curr.left);
			}
			if(curr.right != null) {
				q.add(curr.right);
			}
		}
	}

}
