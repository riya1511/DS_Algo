package graph;
import graph.Graph;

public class Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isCycle(int v) {
		boolean[] visited = new boolean[v];
		boolean[] recS = new boolean[v];
		for(int i = 0; i < v; i++) {
			if(!visited[i]) {   //condition to handle disconnected graph case
				 if(dfs(i,visited,-1)) return true;
//				 if(directedDfs(i,visited,recS)) return true;
			}
		}
		return false;
	}
	
	public static boolean dfs(int v, boolean[] vis, int parent) {
		vis[v] = true;
		for(int neighbour : graph.Graph.adj.get(v)) {
			if(!vis[neighbour]) {
				if(dfs(neighbour,vis,v)) return true;
				else if(parent != neighbour) return true;
			}
		}
		return false;
	}
	
	public static boolean directedDfs(int v, boolean[] vis, boolean[] recS) {
		vis[v] = true;
		recS[v] = true;
		for(int neighbour : graph.Graph.adj.get(v)) {
			if(!vis[neighbour]) {
				if(directedDfs(neighbour,vis,recS)) return true;
				else if(recS[neighbour]) return true;
			}
		}
		recS[v] = false;
		return false;
	}

}
