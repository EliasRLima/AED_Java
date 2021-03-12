package Estruturas;

import Service.Nodo;

public class ArvoreBin {

	
	private Nodo raiz = null;
	
	public Nodo getRaiz() {
	  return this.raiz;	
	}
	
	private void _add(Nodo aux,Nodo novo, int valor) {
		 if(aux != null) {
		    if(valor < aux.getValor()) {
		        if (aux.getAnte() != null) {
		            _add(aux.getAnte(), novo, valor);
		        } else {
		            aux.setAnte(novo);
		        }
		    }else if (valor > aux.getValor()) {
		        if (aux.getProx() != null) {
		            _add(aux.getProx(), novo, valor);
		        } else {
		            aux.setProx(novo);
		        }
		    }
		  }else {
			  raiz = novo;
		  }
	}
	
	public void add(Nodo novo, int valor) {
		_add(raiz, novo, valor);
	}
	
	private Nodo _get(Nodo n, int valor) {
		if(n == null) {
			if(valor == 1)
				System.out.println("arvore vazia");
			return null;
		}
			
		if(n.getValor() == valor) {
			return n;
		}else if(n.getValor() < valor) {
			return _get(n.getProx(), valor);
		}else if(n.getValor() > valor) {
			return _get(n.getAnte(), valor);
		}
		return null;
		
	}
	
	private void _remove(Nodo aux) {
		if(aux != null) {
		    if(aux.getAnte() != null) {
		    	if(aux.getAnte().getAnte() != null) {
		    		_remove(aux.getAnte());
		    	}else {
		    		aux.setAnte(aux.getAnte().getProx());
		    	}
		    }else {
		    	aux = aux.getProx();
		    }
		}
	}
	
	public void remove() {
		_remove(raiz);
	}
	
	public Nodo get(int valor) {
		return _get(raiz, valor);
	}
	
	
}
