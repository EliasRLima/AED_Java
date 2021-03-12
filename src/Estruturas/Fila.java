package Estruturas;

import Service.Nodo;
//import teste.Produto;

public class Fila {

	private Nodo inicio = null;

	public boolean isNull(){
	   if (inicio == null)
	      return true;
	   else
	      return false;
	}

	   public void add(Nodo n) {
		  //Nodo n = new Nodo(novo);
	      if(isNull()) {
	         inicio = n; 
	      }
	      else {
	    	 Nodo aux = inicio;
	    	 while(aux.getProx() != null) {
	    		 aux = aux.getProx();
	    	 }
	    	 n.setAnte(aux);
	         aux.setProx(n);
	      }
	   }
	   
	   public void remove() {
		  this.inicio = this.inicio.getProx();
	   }
	  
	   
	   public Nodo get() {
		   return this.inicio;
	   }
	   
	   private Nodo _get(Nodo aux, int id, int idx) {
		   if(aux == null)
			   return null;
		   if(idx < id)
			   return null;
		   if(idx == id)
			   return aux;
		   
           return _get(aux.getProx(),id+1,idx);
		   
	   }
	   
	   public Nodo get(int idx) {
		   return _get(inicio,1,idx);
	   }
	   
	   
	   
	
	
}
