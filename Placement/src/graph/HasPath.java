package graph;

import java.util.Iterator;
import graph.Graph;

public class HasPath {
	static int v = 6;

	public static void main(String[] args) {
		Graph gra = new Graph(v);
		gra.addEdge(0,1);
		gra.addEdge(0,3);
		gra.addEdge(1,2);
		gra.addEdge(3,1);
		gra.addEdge(3,5);
		gra.addEdge(4,3);
		gra.printGraph();
		System.out.println(hasPath(0,5));
	}
	
	static boolean[] visited = new boolean[v];
	public static boolean hasPath(int source, int destination) {
		if(source == destination) return true;
		visited[source] = true;
//		visited[destination] = true;
		Iterator<Integer> i = Graph.adj.get(source).listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					hasPath(n,destination);
					if(hasPath(n,destination)) return true;
				}
		}
			return false;
	}

}
