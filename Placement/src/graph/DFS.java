package graph;
import graph.Graph;
import java.util.*;

public class DFS {
	
	public static void dfsTraversal(int source, int v) {
		boolean[] visited = new boolean[v];
		
		dfsutil(source,visited);
	}
	
	public static void dfsutil(int source, boolean[] visited) {
		visited[source] = true;
		System.out.print(source + " ");
		Iterator<Integer> i = Graph.adj.get(source).listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n]) {
				visited[n] = true;
				dfsutil(n,visited);
			}
		}
	}
	
	//for disconnected graph iterate through the vertices and call the dfs for the unvisited node by adding
	//condition (!visited[i])

	public static void main(String[] args) {
		int vertices = 4;
		Graph gra = new Graph(vertices);
		gra.addEdge(0,1);
		gra.addEdge(1,2);
		gra.addEdge(1,3);
//		gra.addEdge(2,4);
//		gra.addEdge(3,5);
		gra.printGraph();
		dfsTraversal(0,4);

	}

}
