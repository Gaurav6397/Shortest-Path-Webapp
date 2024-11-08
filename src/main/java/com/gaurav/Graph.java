package com.gaurav;
import java.util.*;
public class Graph {
	int vertices;
	List<List<Integer>> myGraph;
	Graph(int vertices){
		this.vertices  = vertices;
		this.myGraph = new ArrayList<>(vertices);
		for(int i=0; i<vertices; i++)
			myGraph.add(new ArrayList<>());
	}
	public void addEdge(int i, int j) {
		myGraph.get(i).add(j);
		myGraph.get(j).add(i);
	}
	public List<Integer> findPath(int start, int end) {
		int[] parent = new int[vertices];
		Arrays.fill(parent, -1);
		parent[start] = start;
		boolean[] visited = new boolean[vertices];
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		boolean found = false;
		while(!q.isEmpty() && !found) {
			Integer curr = q.remove();
			for(Integer v: myGraph.get(curr)) {
				if(!visited[v]) {
					q.add(v);
					parent[v] = curr;
					visited[v] = true;
					if(v == end) {
						found = true;
						break;
					}
						
				}
			}
		}
		if(!found)
			return new ArrayList<>();
		List<Integer> res = new ArrayList<>();
		while(end!=start) {
			res.add(end);
			end = parent[end];
		}
		res.add(start);
		Collections.reverse(res);
		return res;
	}
}
