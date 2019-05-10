package main;

import graph.Edge;
import graph.Graph;
import graph.Vertex;

public class PTB {
	public static int INF= 99999;
	public PTB() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph<String> graph = new Graph<String>();
		Vertex<String> start = new Vertex<String>("start");
		Vertex<String> burro= new Vertex<String>("Burro");
		Vertex<String> tigre= new Vertex<String>("Tigre");
		Vertex<String> paja= new Vertex<String>("Paja");
		Vertex<String> paja_tigre = new Vertex<String>("paja-tigre");
		Vertex<String> paja_burro = new Vertex<String>("paja-burro");
		Vertex<String> tigre_burro = new Vertex<String>("tigre-burro");
		Vertex<String> final_ = new Vertex<String>("final");
		
//		De cero a primer nivel
		Edge<String> aBurro_1 = new Edge<String>(burro, 1);
		Edge<String> aStart_1 = new Edge<String>(start,1);
		start.add(aBurro_1);
//		graph.addData(burro, aStart_1);
		
//		De primer a segundo nivel
		Edge<String> aPajaTigre_1 = new Edge<String>(paja_tigre, 1);
		Edge<String> aPajaBurro_1 = new Edge<String>(paja_burro, 1);
//		graph.addData(paja, aPajaTigre_1);
//		graph.addData(paja, aPajaBurro_1);
		Edge<String> aTigreBurro_2 = new Edge<String>(tigre_burro, 2);
		Edge<String> aPajaBurro_2 = new Edge<String>(paja_burro, 2);
//		graph.addData(burro, aTigreBurro_2);
//		graph.addData(burro, aPajaBurro_2);
		Edge<String> aTigreBurro_1 = new Edge<String>(tigre_burro, 1);
//		graph.addData(tigre, aTigreBurro_1);
//		graph.addData(tigre, aPajaTigre_1);
		
//		De segundo a primer nivel
		Edge<String> aPaja_1 = new Edge<String>(paja, 1);
		Edge<String> aTigre_1 = new Edge<String>(tigre, 1);
//		graph.addData(paja_tigre, aPaja_1);
//		graph.addData(paja_burro, aPaja_1);

//		graph.addData(paja_tigre, aTigre_1);
//		graph.addData(tigre_burro, aTigre_1);

//		graph.addData(paja_burro, aBurro_1);
//		graph.addData(tigre_burro, aBurro_1);		

//		De segundo a tercer nivel
		Edge<String> aPBT_2 = new Edge<String>(final_, 2);
//		graph.addData(paja_tigre, aPBT_2);

//		Mínimo costo con dijkstra
		System.out.println("El mínimo costo es: ");
		System.out.println(graph.dijkstra(burro,final_));
//		System.out.println(graph.dijkstra(start,final_));
		
//		Matriz de adyacencia
		int n = graph.getnVertices();
		double[][] a_matrix = graph.getMadj_nd();
		double[][] matrix = graph.floyd_warshall(a_matrix, n);
		
//		Matriz Floyd-Warshall
		System.out.println("\nMatriz Floyd-Warshall:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
