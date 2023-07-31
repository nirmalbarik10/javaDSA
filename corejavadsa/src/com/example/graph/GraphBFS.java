package com.example.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.example.graph.GraphDemo.Edge;

public class GraphBFS {

	static class Edge {
		private int src;
		private int dest;

		public Edge(int s, int d) {
			this.src = s;
			this.dest = d;

		}
	}

	public static void createGraph(ArrayList<Edge>[] graph) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}

		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));

		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 3));

		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 4));

		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 4));
		graph[3].add(new Edge(3, 5));

		graph[4].add(new Edge(4, 2));
		graph[4].add(new Edge(4, 3));
		graph[4].add(new Edge(4, 5));

		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));
		graph[5].add(new Edge(5, 6));

		graph[6].add(new Edge(6, 5));
	}

	private static void bfs(ArrayList<Edge>[] graph, int v, boolean isVisited[], int start) {
		Queue<Integer> q = new LinkedList<>();
		// boolean[] isVisited = new boolean[v] ;
		// q.add(0);
		q.add(start);
		while (!q.isEmpty()) {
			int current = q.remove();
			if (!isVisited[current]) {
				System.out.print(current + " ");
				isVisited[current] = true;
				for (int i = 0; i < graph[current].size(); i++) {
					Edge e = graph[current].get(i);					
					q.add(e.dest);
				}
			}
		}

	}

	private static void dfs(ArrayList<Edge>[] graph, int cur, boolean[] vis) {
		System.out.print(cur+" ");
		vis[cur] =true;
		for(int i=0;i<graph[cur].size();i++) {
			Edge e=graph[cur].get(i);
			if(!vis[e.dest]) {
			dfs(graph,e.dest,vis);
			}
		}

	}

	private static void printAllPath(ArrayList<Edge>[] graph, boolean[] vis, int cur, String path, int tar) {
		if(cur==tar) {
			System.out.println(path);
			return;
		}
		for(int i=0;i<graph[cur].size();i++) {
			Edge e =graph[cur].get(i);
			if(!vis[e.dest]) {
				vis[cur]=true;
				printAllPath(graph, vis, e.dest, path+e.dest, tar);
				vis[cur]=false;
			}
		}
	}
	

	public static void main(String[] args) {
		int v = 7;
		ArrayList<Edge>[] graph = new ArrayList[v];
		createGraph(graph);
		boolean vis[] = new boolean[v];
//			for(int i=0;i<v;i++) {
//				if(!vis[i]) {
//					bfs(graph,v,vis,i);
//				}
//			}
		
//		for (int i = 0; i < v; i++) {
//			if (!vis[i]) {
//				dfs(graph, i, vis);
//			}
//		}
		
		int src=0,tar=5;
		printAllPath(graph,vis,src,"0",tar);
	}

	

}
