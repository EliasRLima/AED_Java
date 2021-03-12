package Service;

import ProblemaFrota.Taxi;
import ProblemaProduto.Produto;

public class Nodo {
        
	private Produto Produto;
	private Taxi taxi;
	private Nodo ante;
	private Nodo prox;
	private double valor;
	
	public Nodo(Produto Produto) {
		super();
		this.Produto = Produto;
		this.ante = null;
		this.prox = null;
	}
	
	public Nodo(Produto Produto, int valor) {
		super();
		this.Produto = Produto;
		this.valor = valor;
		this.ante = null;
		this.prox = null;
	}
	
	public Nodo(Taxi taxi) {
		super();
		this.taxi = taxi;
		this.ante = null;
		this.prox = null;
	}
	
	public Nodo(Taxi taxi, int valor) {
		super();
		this.taxi = taxi;
		this.valor = valor;
		this.ante = null;
		this.prox = null;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Produto getProduto() {
		return Produto;
	}

	public void setProduto(Produto Produto) {
		this.Produto = Produto;
	}

	public Taxi getTaxi() {
		return taxi;
	}

	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}

	public Nodo getAnte() {
		return ante;
	}

	public void setAnte(Nodo ante) {
		this.ante = ante;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}
	  
	  
	  
	  
}
