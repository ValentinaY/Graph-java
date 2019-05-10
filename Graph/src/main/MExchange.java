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
		
//		Se agrega como negativo la ganancia
		eur.add(new Edge<String>(cad, 0.11));
		eur.add(new Edge<String>(mxn, -0.52));
		eur.add(new Edge<String>(chf, 0.42));
		eur.add(new Edge<String>(nok, 0.10));
		eur.add(new Edge<String>(gbt, -0.09));
		graph.addVertex(eur);
		
		mxn.add(new Edge<String>(cad, 0.32));
		mxn.add(new Edge<String>(sek, 0.22));
		mxn.add(new Edge<String>(usd, 0.12));
		mxn.add(new Edge<String>(nzd, 0.32));
		mxn.add(new Edge<String>(nok, 0.45));
		graph.addVertex(mxn);
		
		cad.add(new Edge<String>(cad, -0.42));
		cad.add(new Edge<String>(mxn, 0.52));
		cad.add(new Edge<String>(chf, -0.22));
		cad.add(new Edge<String>(nok, 0.05));
		cad.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(cad);
		
		chf.add(new Edge<String>(cad, 0.12));
		chf.add(new Edge<String>(mxn, 0.52));
		chf.add(new Edge<String>(chf, -0.42));
		chf.add(new Edge<String>(nok, 0.05));
		chf.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(chf);
		
		aud.add(new Edge<String>(cad, 0.12));
		aud.add(new Edge<String>(mxn, -0.52));
		aud.add(new Edge<String>(chf, 0.42));
		aud.add(new Edge<String>(nok, -0.05));
		aud.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(aud);
		
		nok.add(new Edge<String>(cad, 0.12));
		nok.add(new Edge<String>(mxn, 0.21));
		nok.add(new Edge<String>(chf, -0.21));
		nok.add(new Edge<String>(nok, 0.05));
		nok.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(nok);
		
		sgd.add(new Edge<String>(cad, -0.12));
		sgd.add(new Edge<String>(mxn, 0.52));
		sgd.add(new Edge<String>(chf, 0.42));
		sgd.add(new Edge<String>(nok, -0.05));
		sgd.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(sgd);
		
		sek.add(new Edge<String>(cad, 0.12));
		sek.add(new Edge<String>(mxn, -0.52));
		sek.add(new Edge<String>(chf, 0.42));
		sek.add(new Edge<String>(nok, 0.05));
		sek.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(sek);
		
		brl.add(new Edge<String>(cad, 0.12));
		brl.add(new Edge<String>(mxn, 0.52));
		brl.add(new Edge<String>(chf, -0.42));
		brl.add(new Edge<String>(nok, 0.05));
		brl.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(brl);
		
		gbt.add(new Edge<String>(cad, 0.12));
		gbt.add(new Edge<String>(mxn, 0.52));
		gbt.add(new Edge<String>(chf, -0.42));
		gbt.add(new Edge<String>(usd, 0.05));
		gbt.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(gbt);
		
		usd.add(new Edge<String>(nzd, -0.12));
		usd.add(new Edge<String>(brl, 0.52));
		usd.add(new Edge<String>(sek, 0.42));
		usd.add(new Edge<String>(nok, 0.05));
		usd.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(usd);
		
		nzd.add(new Edge<String>(cad, -0.21));
		nzd.add(new Edge<String>(mxn, -0.90));
		nzd.add(new Edge<String>(chf, 0.42));
		nzd.add(new Edge<String>(nok, -0.30));
		nzd.add(new Edge<String>(gbt, 0.09));
		graph.addVertex(nzd);
		
		System.out.println(graph.dijkstra(nzd, nok));
		System.out.println(graph.dijkstra(usd, eur));
	}

}
