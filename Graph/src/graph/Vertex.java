package graph;

import java.util.ArrayList;

public class Vertex <T>{

	private T data;	
	private ArrayList<Edge<T>> neighbors;

	public Vertex(T data){
		neighbors = new ArrayList<Edge<T>>();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void add(Edge<T> e) {
		this.neighbors.add(e);
	}
	
	public ArrayList<Edge<T>> getNeighbors() {
		return this.neighbors;
	}

	public void showNeighbors() {
		for (Edge<T> edge : neighbors) {
			System.out.println(edge.toString());
		}
	}
	
	public void setNeighbors(ArrayList<Edge<T>> neighbors) {
		this.neighbors = neighbors;
	}

	public String toString() {
		if(this.data == null) {
			return "null";
		}
		return this.data.toString();
	}
}
