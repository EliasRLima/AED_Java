package ProblemaProduto;

import Estruturas.ArvoreBin;
import Estruturas.Fila;
import Estruturas.ListaEncadeadaDupla;
import Estruturas.Pilha;
import Service.Nodo;

public class ServiceNodo {

	public static Produto to_Produto(Nodo n) {
		return n.getProduto();
	}
	
	public static Nodo to_Nodo(Produto p) {
		return new Nodo(p);
	}
	
	public static Nodo to_Nodo(Produto p, int i) {
		return new Nodo(p,i);
	}
	
	public static void list(ListaEncadeadaDupla led) {
		System.out.println("------Lista---------");
		int i = 1;
		Nodo aux = led.get(i);
		for(;aux != null;) {
			System.out.println("Produto " + i + ": " + aux.getProduto().getNome());
	        if(aux.getAnte() != null)
	           System.out.println("Anterior: " + aux.getAnte().getProduto().getNome());
	        if(aux.getProx() != null)
	           System.out.println("Posterior: " + aux.getProx().getProduto().getNome());
	        aux = led.get(++i);
		}
	}
	
	public static void list(Fila f) {
		System.out.println("------Fila---------");
		int i = 1;
		Nodo aux = f.get(i);
		for(;aux != null;) {
			System.out.println("Produto : " + aux.getProduto().getNome() + "\nvalor: " + aux.getProduto().getValor());
	        aux = f.get(++i);
		}
	}
	
	public static void list(Pilha p) {
		System.out.println("------Pilha---------");
		int i = 1;
		Nodo aux = p.get(i);
		for(;aux != null;) {
			System.out.println("Produto : " + aux.getProduto().getNome() + "\nvalor: " + aux.getProduto().getValor());
	        aux = p.get(++i);
		}
	}
	
	private static void _list(Nodo aux) {
		if(aux!=null) {
			if(aux.getAnte() != null)
				_list(aux.getAnte());
			if(aux.getProx() != null)
				_list(aux.getProx());
			System.out.println("Produto : " + aux.getProduto().getNome() + "\nvalor: " + aux.getProduto().getValor());
		}
	}
	
	public static void list(ArvoreBin p) {
		System.out.println("------Arvore---------");
		_list(p.getRaiz());
		//p.get(i);
		
		
		/*for(;aux != null;) {
			System.out.println("Produto " + i + ": " + aux.getProduto().getNome());
	        aux = p.get(++i);
		}*/
	}
	
}
