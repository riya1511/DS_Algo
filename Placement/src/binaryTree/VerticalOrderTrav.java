package binaryTree;
import java.util.*;

class Pair{
	int horiDistance;
	Node root;
	Pair(int horiDistance, Node root){
		this.horiDistance = horiDistance;
		this.root = root;
	}
}

public class VerticalOrderTrav {

	public static void main(String[] args) {
		Node first = new Node(2);
		first.left = new Node(4);
		first.left.left = new Node(7);
		first.right = new Node(1);
		first.right.left = new Node(8);
		first.right.right = new Node(3);
		ArrayList<Integer> al = verTraversal(first);
		for(int e : al) {
			System.out.println(e);
		}
	}
	
	public static ArrayList<Integer> verTraversal(Node root){
		Queue<Pair> q = new ArrayDeque<>();
		Map<Integer,ArrayList<Integer>> map = new TreeMap<>();
		q.add(new Pair(0,root));
		while(!q.isEmpty()) {
			Pair curr = q.poll();
			if(map.containsKey(curr.horiDistance)) {
				map.get(curr.horiDistance).add(curr.root.value);
			}else {
				ArrayList<Integer> res = new ArrayList<>();
				res.add(curr.root.value);
				map.put(curr.horiDistance, res);
			}
			if(curr.root.left != null) {
				q.add(new Pair(curr.horiDistance - 1, curr.root.left));
			}
			if(curr.root.right != null){
				q.add(new Pair(curr.horiDistance + 1, curr.root.right));
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		//traversing through map
		for(Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet()) {
			ans.addAll(entry.getValue());
		}
		return ans;
 	}

}
