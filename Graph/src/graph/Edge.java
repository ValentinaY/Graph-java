package graph;

public class Edge<T> implements Comparable<T>{
	private int cost;
	private Vertex<T> vertex;
	public Edge() {
		// TODO Auto-generated constructor stub
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Vertex<T> getVertex() {
		return vertex;
	}
	public void setVertex(Vertex<T> data) {
		this.vertex = data;
	}
	public Edge(Vertex<T> data, int cost) {
		super();
		this.cost = cost;
		this.vertex = data;
	}
	
	public String toString() {
		return Integer.toString(this.cost)+vertex.toString();
	}
	
	@Override
	public int compareTo(Object arg0) {
		@SuppressWarnings("unchecked")
		Edge<T> a= ((Edge<T>) arg0);
		return (this.getCost() < a.getCost())? -1: 1;
	}
}
