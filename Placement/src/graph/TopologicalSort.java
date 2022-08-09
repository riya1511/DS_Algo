package graph;
import java.util.*;

//in topological sorting the parent node must appear before the child node in a directed acyclic graph
//inDegree - number of edges directed towards the node
//outDegree - number of edges directed away from it

public class TopologicalSort {

	public static void main(String[] args) {
		

	}
	
	public static int[] topoSortDFS(ArrayList<ArrayList<Integer>> adj, int vertices) {
		boolean[] visited = new boolean[vertices];
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < vertices; i++) {
			if(!visited[i]) {
				dfs(adj,i,stack,visited);
			}
		}
		
		int[] ans = new int[vertices];
		int i = 0;
		while(!stack.isEmpty()) {
			ans[i++] = stack.pop();
 		}
		return ans;
	}
	
	//we are calculating the initial inDegree of every node and then for every node with inDegree == 0, we are inserting it 
	//into a queue and decrementing the inDegree of its neighbor and again inserting the nodes whose inDegree is 0
	
	public static ArrayList<Integer> topoSortBFS(ArrayList<ArrayList<Integer>> adj, int vertices){
		boolean[] visited = new boolean[vertices];
		int[] inDeg = new int[vertices];
		ArrayList<Integer> ans = new ArrayList<>();
		bfs(adj,0,vertices,inDeg,visited,ans);
		return ans;
	}
	
	public static void bfs(ArrayList<ArrayList<Integer>> adj, int v, int vertices, int[] inDeg, boolean[] visited, ArrayList<Integer> ans) {
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0; i < vertices; i++) {
			if(inDeg[i] == 0) {
				queue.add(i);
			}
		}
		
		while(!queue.isEmpty()) {
			int curr = queue.poll();
			ans.add(curr);
			
			for(int neighbor: adj.get(curr)) {
				if(--inDeg[neighbor] == 0) {
					queue.add(neighbor);
				}
			}
		}
	}
	
	public static void dfs(ArrayList<ArrayList<Integer>> adj, int v, Stack<Integer> stack, boolean[] vis) {
		vis[v] = true;
		Iterator<Integer> i = adj.get(v).listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!vis[n]) {
				vis[n] = true;
				dfs(adj,n,stack,vis);
			}
		}
	}

}
