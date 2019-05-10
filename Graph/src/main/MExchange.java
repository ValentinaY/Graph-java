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
		Vertex<String> chf = new Vertex<String>("chf");
		Vertex<String> aud = new Vertex<String>("aud");
		Vertex<String> nok = new Vertex<String>("nok");
		Vertex<String> sgd = new Vertex<String>("sgd");
		Vertex<String> brl = new Vertex<String>("brl");
		Vertex<String> sek = new Vertex<String>("sek");
		Vertex<String> gbt = new Vertex<String>("gbt");
		Vertex<String> usd = new Vertex<String>("usd");
		Vertex<String> nzd = new Vertex<String>("nzd");	
		
		graph.addVertex(eur);
		graph.addVertex(mxn);
		graph.addVertex(cad);
		graph.addVertex(chf);
		graph.addVertex(aud);
		graph.addVertex(nok);
		graph.addVertex(sgd);
		graph.addVertex(sek);
		graph.addVertex(brl);
		graph.addVertex(gbt);
		graph.addVertex(usd);
		graph.addVertex(nzd);
	}

}
