package main;

import graph.Edge;
import graph.Graph;
import graph.Vertex;
import graph.Edge;

public class MExchange {

	public MExchange() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph<String> graph = new Graph<String>();
		
		Vertex<String> eur = new Vertex<String>("eur");
		Vertex<String> mxn = new Vertex<String>("mxn");
		Vertex<String> cad = new Vertex<String>("cad");
		Vertex<String> aud = new Vertex<String>("aud");
		Vertex<String> brl = new Vertex<String>("brl");
		Vertex<String> gbt = new Vertex<String>("gbt");
		Vertex<String> usd = new Vertex<String>("usd");
		
//		Se agrega como negativo la ganancia
		eur.add(new Edge<String>(cad, 0.11));
		eur.add(new Edge<String>(mxn, -0.52));
		eur.add(new Edge<String>(gbt, -0.09));
		graph.addVertex(eur);
		
		mxn.add(new Edge<String>(cad, 0.32));
		mxn.add(new Edge<String>(usd, 0.12));
		graph.addVertex(mxn);
		
		cad.add(new Edge<String>(cad, -0.42));
		cad.add(new Edge<String>(mxn, 0.52));
		cad.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(cad);
		
		aud.add(new Edge<String>(mxn, -0.52));
		aud.add(new Edge<String>(cad, 0.12));
		aud.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(aud);
		
		brl.add(new Edge<String>(cad, 0.12));
		brl.add(new Edge<String>(mxn, 0.52));
		brl.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(brl);
		
		gbt.add(new Edge<String>(cad, 0.12));
		gbt.add(new Edge<String>(mxn, 0.52));
		gbt.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(gbt);
		
		usd.add(new Edge<String>(gbt, 0.09));
		usd.add(new Edge<String>(eur, -0.19));
		usd.add(new Edge<String>(cad, -0.29));
		usd.add(new Edge<String>(mxn, 0.89));
		graph.addVertex(usd);
		
		System.out.println(graph.dijkstra(gbt, cad));
		System.out.println(graph.dijkstra(usd, eur));
	}

}
