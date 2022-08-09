package graph;
import graph.Graph;
import java.util.*;

public class BFS {
	
	public static void bfsTraversal(int source, int v) {
		boolean[] visited = new boolean[v];
		LinkedList<Integer> queue = new LinkedList<>();
		visited[source] = true;
		queue.add(source);
		while(queue.size() != 0) {
			source = queue.poll();
			System.out.print(source + " ");
			Iterator<Integer> i = Graph.adj.get(source).listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	public static void main(String[] args) {
		int vertices = 6;
		Graph gra = new Graph(vertices);
		gra.addEdge(0,1);
		gra.addEdge(0,2);
		gra.addEdge(1,3);
		gra.addEdge(2,4);
		gra.addEdge(3,5);
		gra.printGraph();
		bfsTraversal(0,6);

	}

}
