package graph;
import java.util.*;


class Graph{
	public static ArrayList<ArrayList<Integer>> adj;
	
	public Graph(int v) {
		adj = new ArrayList<ArrayList<Integer>>(v);
		for(int i = 0; i < v; i++) {
			adj.add(i, new ArrayList<Integer>());
		}
	}
	public void addEdge(int source, int destination) {
		adj.get(source).add(destination);
		adj.get(destination).add(source);
	}
	public void printGraph() {
		for(int i = 0; i < adj.size(); i++) {
			System.out.println(i + "->");
			for(int j = 0; j < adj.get(i).size(); j++) {
				System.out.print("->" + adj.get(i).get(j));
			}
			System.out.println();
		}
	}
}

public class creation {
	public static void main(String[] args) {
		int vertices = 5;
		Graph gra = new Graph(vertices);
		gra.addEdge(0,3);
		gra.addEdge(0,4);
		gra.addEdge(1,3);
		gra.addEdge(1,4);
		gra.addEdge(2,4);
		gra.addEdge(3,4);
		gra.printGraph();
	}

}
