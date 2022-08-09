package binarySearchTree;

import java.util.HashSet;

public class SumPair {

	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<>();
		Node first = new Node(40);
		first.left = new Node(20);
		first.right = new Node(60);
		first.left.left = new Node(10);
		first.left.right = new Node(30);
		System.out.println(two_sum(first,s,109));
	}
	
	static boolean two_sum(Node root, HashSet<Integer> set, int sum) {
		if(root == null) return false;
		
		if(two_sum(root.left,set,sum) == true) return true;
		
		if(set.contains(Math.abs(sum - root.value))) return true;
		set.add(root.value);
		
		return two_sum(root.right, set, sum);
	}

}
