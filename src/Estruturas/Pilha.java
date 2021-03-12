package Estruturas;

import Service.Nodo;
//import teste.Produto;

public class Pilha {

	private Nodo inicio = null;
	private Nodo topo = null;

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
	      topo = n;
	   }
	   
	   public void remove() {
		  this.topo.getAnte().setProx(null);
		  this.topo = this.topo.getAnte();
	   }
	  
	   
	   public Nodo get() {
		   return topo;
	   }
	   
	   private Nodo _get(Nodo aux, int id, int idx) {
		   if(aux == null)
			   return null;
		   if(idx < id)
			   return null;
		   if(idx == id)
			   return aux;
		   
           return _get(aux.getAnte(),id+1,idx);
		   
	   }
	   
	   public Nodo get(int idx) {
		   return _get(topo,1,idx);
	   }
	   
	
	
}
