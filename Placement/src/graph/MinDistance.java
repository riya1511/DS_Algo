package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class MinDistance {

	public static void main(String[] args) {
		int vertices = 6;
		int pred[] = new int[vertices+1];
		int dis[] = new int[vertices+1];
		Graph gra = new Graph(vertices);
		gra.addEdge(0,1);
		gra.addEdge(0,2);
		gra.addEdge(1,3);
		gra.addEdge(2,4);
		gra.addEdge(3,5);
		gra.printGraph();
		findShortestDistance(0,2,dis,pred,vertices);
	}
	
	public static void findShortestDistance(int source, int destination, int[] dis, int[] pred, int v) {
		boolean[] visited = new boolean[v];
		LinkedList<Integer> queue = new LinkedList<>();
		for(int i = 0; i < v; i++) {
			visited[i] = false;
			dis[i] = Integer.MAX_VALUE;
			pred[i] = -1;
		}
		visited[source] = true;
		queue.add(source);
		dis[source] = 0;
		while(queue.size() != 0) {
			int curr = queue.poll();
			Iterator<Integer> i = Graph.adj.get(source).listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					dis[n] = dis[curr] + 1;
					queue.add(n);
					
					if(n == destination) {
						System.out.println("Has path");
						System.out.println("The minimum distance is: " + dis[n]);
					}
				}
			}
		}
		return;
	}

}
