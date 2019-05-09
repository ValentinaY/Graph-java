package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.TreeSet;

public class Graph<T> {

	private HashMap<String, Vertex<T>> vertices;
	private final int INF = 99999;
	
	public Graph() {
		vertices = new HashMap<String, Vertex<T>>();
	}

	public ArrayList<Vertex<T>> getVertices(){
		return new ArrayList<Vertex<T>>(vertices.values());
	}
	
	public HashMap<String, Integer> getVindexes(){
		ArrayList<Vertex<T>> vertices = getVertices();
		HashMap<String, Integer> positions = new HashMap<String, Integer>();
		int cont=0;
//		Se transcribe el hashmap a matriz de adyacencia.
		for (Vertex<T> vertex : vertices) {
			positions.put(vertex.toString(), cont);
			cont++;
		}
		return positions;
	}
	
	public int getnVertices() {
		return vertices.size();
	}
	
	public void addData(Vertex<T> v, Edge<T> e) {
		vertices.putIfAbsent(v.toString(), v);
		vertices.putIfAbsent(e.getVertex().toString(), e.getVertex());
		v.add(e);
	}
	
	public int dijkstra(Vertex<T> a, Vertex<T> b) {
		TreeSet<Edge<T>> tree = new TreeSet<Edge<T>>();
		HashMap<String, Integer> costs = new HashMap<String, Integer>();
		int cost = 0;
		int cont = 0;
		ArrayList<Edge<T>> ves = a.getNeighbors();
		Vertex<T> actual = a;
		costs.put(actual.toString(),0);
		do {
			for (Edge<T> v : ves) {
				String id=v.getVertex().toString();
				if(!costs.containsKey(id)){
					tree.add(v);
					costs.put(id,costs.get(actual.toString())+v.getCost());
				}	
				else {
					costs.put(id, Math.min(cost+v.getCost(), costs.get(id)));					
				}
			}
			Edge<T> edge = tree.pollFirst();
			actual = edge.getVertex();
			cost = edge.getCost()+costs.get(actual.toString());
			ves=actual.getNeighbors();
			cont++;
		} while(cont<getnVertices()-1);
		return costs.getOrDefault(b.toString(), -1);
	}
	
	/**
	 * Retorna la matriz de adyacencia en un grafo no dirigido.
	 * @return
	 */
	public int[][] getMadj_nd() {
		
		int n = this.getnVertices();
		
		int[][] matrix = new int [n][n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				matrix[i][j] = INF;
			}
		}

		ArrayList<Vertex<T>> vertices = getVertices();
		HashMap<String, Integer> positions = getVindexes();
		
		for (Vertex<T> vertex : vertices) {
			ArrayList<Edge<T>> edges = vertex.getNeighbors();
			for (Edge<T> edge : edges) {
				int a = positions.get(vertex.toString());
				int b = positions.get(edge.getVertex().toString());
				matrix[a][b] = edge.getCost();
				matrix[b][a] = edge.getCost();
			}
		}
		
		return matrix;
	}
	

	/**
	 * Retorna la matriz de adyacencia en un grafo dirigido.
	 * @return
	 */
	public int[][] getMadj_d() {
		
		int n = this.getnVertices();
		
		int[][] matrix = new int [n][n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				matrix[i][j] = INF;
			}
		}

		ArrayList<Vertex<T>> vertices = getVertices();
		HashMap<String, Integer> positions = getVindexes();
		
		for (Vertex<T> vertex : vertices) {
			ArrayList<Edge<T>> edges = vertex.getNeighbors();
			for (Edge<T> edge : edges) {
				int a = positions.get(vertex.toString());
				int b = positions.get(edge.getVertex().toString());
				matrix[a][b] = edge.getCost();
			}
		}
		
		return matrix;
	}
	
	public int[][] floyd_warshall(int graph[][], int n) 
    { 
        int matrix[][] = new int[n][n]; 
        int i, j, k; 
        for (i=0; i<n; i++) 
            for (j=0; j<n; j++) 
                matrix[i][j] = graph[i][j]; 
        for (k=0; k<n; k++) {
            for (i=0; i<n; i++){ 
            	for (j=0; j<n; j++){
                    if (matrix[i][k] + matrix[k][j] < matrix[i][j]) 
                        matrix[i][j] = matrix[i][k] + matrix[k][j]; 
                }
            } 
        }
        return matrix;
    }   
	/**
	 * Retorna la ArrayList con los vertices.
	 * @return
	 */
	public ArrayList<Vertex<T>> DFS(Vertex<T> v) 
    { 
		ArrayList<Vertex<T>> result = new ArrayList<Vertex<T>>();
		Stack<Vertex<T>> stack = new Stack<>();
		stack.push(v);
		
		while(!stack.empty()) {
			v = stack.pop();
			
			if (v.isVisited())
				continue;
			
			v.setVisited(true);
			result.add(v);
			
			ArrayList<Edge<T>> neighbors = v.getNeighbors();
			for (int i=neighbors.size() - 1; i>=0; i--) {
				
				Vertex<T> u = neighbors.get(i).getVertex();
				if (!u.isVisited()) {
					stack.push(u);
				}
			}
		}
		return result;
    } 
}
