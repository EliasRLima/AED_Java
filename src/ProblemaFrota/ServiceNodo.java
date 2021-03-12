package ProblemaFrota;

import Estruturas.ArvoreBin;
import Estruturas.Fila;
import Estruturas.ListaEncadeadaDupla;
import Estruturas.Pilha;
import Service.Nodo;

public class ServiceNodo {

	public static Taxi to_Taxi(Nodo n) {
		return n.getTaxi();
	}
	
	public static Nodo to_Nodo(Taxi p) {
		return new Nodo(p);
	}
	
	public static Nodo to_Nodo(Taxi p, int i) {
		return new Nodo(p,i);
	}
	
	public static void list(ListaEncadeadaDupla led) {
		System.out.println("------Lista---------");
		int i = 1;
		Nodo aux = led.get(i);
		for(;aux != null;) {
			System.out.println("Taxi " + i + ": " + aux.getTaxi().getplaca());
	        if(aux.getAnte() != null)
	           System.out.println("Anterior: " + aux.getAnte().getTaxi().getplaca());
	        if(aux.getProx() != null)
	           System.out.println("Posterior: " + aux.getProx().getTaxi().getplaca());
	        aux = led.get(++i);
		}
	}
	
	public static void list(Fila f) {
		System.out.println("------Fila---------");
		int i = 1;
		Nodo aux = f.get(i);
		for(;aux != null;) {
			System.out.println("Taxi " + i + ": " + aux.getTaxi().getplaca());
	        aux = f.get(++i);
		}
	}
	
	public static void list(Pilha p) {
		System.out.println("------Pilha---------");
		int i = 1;
		Nodo aux = p.get(i);
		for(;aux != null;) {
			System.out.println("Taxi " + i + ": " + aux.getTaxi().getplaca());
	        aux = p.get(++i);
		}
	}
	
	public static void list(ArvoreBin p) {
		System.out.println("------Arvore---------");
		int i = 1;
		Nodo aux = p.get(i);
		for(;aux != null;) {
			System.out.println("Taxi " + i + ": " + aux.getTaxi().getplaca());
	        aux = p.get(++i);
		}
	}
	
}
