package ProblemaFrota;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import Estruturas.ArvoreBin;
import Estruturas.Fila;
import Estruturas.ListaEncadeadaDupla;
import Estruturas.Pilha;

public class ServiceTaxi {
		
	public static Pilha getPilha() throws FileNotFoundException {
		Pilha p = new Pilha();
		Scanner in = new Scanner(new FileReader("problemaFrota/taxis.txt"));
		while (in.hasNextLine()) {
		    String line[] = in.nextLine().split(";");
		    Taxi e = new Taxi(line[0]);
		    p.add(ServiceNodo.to_Nodo(e));
		}
		return p;
	}
	
	public static Fila getFila() throws FileNotFoundException {
		Fila p = new Fila();
		Scanner in = new Scanner(new FileReader("problemaFrota/taxis.txt"));
		while (in.hasNextLine()) {
		    String line[] = in.nextLine().split(";");
		    Taxi e = new Taxi(line[0]);
		    p.add(ServiceNodo.to_Nodo(e));
		}
		return p;
	}
	
	public static ListaEncadeadaDupla getListaEncadeadaDupla(String link) throws FileNotFoundException {
		ListaEncadeadaDupla p = new ListaEncadeadaDupla();
		Scanner in = new Scanner(new FileReader(link));
		while (in.hasNextLine()) {
		    String line[] = in.nextLine().split(";");
		    Taxi e = new Taxi(line[0]);
		    p.add(ServiceNodo.to_Nodo(e));
		}
		return p;
	}
	
	public static ArvoreBin getArvore(String link) throws FileNotFoundException {
		 ArvoreBin p = new  ArvoreBin();
		Scanner in = new Scanner(new FileReader(link));
		int i = 1;
		while (in.hasNextLine()) {
		    String line[] = in.nextLine().split(";");
		    Taxi e = new Taxi(line[0]);
		    p.add(ServiceNodo.to_Nodo(e,i), i);
		    i+=1;
		}
		return p;
	}
	
}
