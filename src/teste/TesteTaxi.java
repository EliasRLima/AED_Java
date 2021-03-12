package teste;

import java.io.FileNotFoundException;

import Estruturas.ArvoreBin;
import Estruturas.Fila;
import Estruturas.ListaEncadeadaDupla;
import Estruturas.Pilha;
import ProblemaFrota.ServiceNodo;
import ProblemaFrota.ServiceTaxi;

public class TesteTaxi {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		long tempoInicial = System.currentTimeMillis();
		
		ListaEncadeadaDupla lista = ServiceTaxi.getListaEncadeadaDupla("C:\\Users\\svtr_\\Desktop\\taxis.txt");
		ServiceNodo.list(lista);
		
		System.out.println("\n\n\n\no metodo executou em " + (System.currentTimeMillis() - tempoInicial) + " segundos.");

	}

}



