package ProblemaProduto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import Estruturas.ArvoreBin;
import Estruturas.Fila;
import Estruturas.ListaEncadeadaDupla;
import Estruturas.Pilha;
import java.io.InputStream;

public class ServiceProduto {
	
        private static InputStream fi;
        
	public static Pilha getPilha(String link) throws FileNotFoundException {
		Pilha p = new Pilha();
                fi = ServiceProduto.class.getResourceAsStream(link);
		Scanner in = new Scanner(fi);
		while (in.hasNextLine()) {
		    String line[] = in.nextLine().split(";");
		    Produto e = new Produto(line[0], Double.parseDouble(line[1]));
		    p.add(ServiceNodo.to_Nodo(e));
		}
		return p;
	}
	
	public static Fila getFila(String link) throws FileNotFoundException {
		Fila p = new Fila();
		fi = ServiceProduto.class.getResourceAsStream(link);
		Scanner in = new Scanner(fi);;
		while (in.hasNextLine()) {
		    String line[] = in.nextLine().split(";");
		    Produto e = new Produto(line[0], Double.parseDouble(line[1]));
		    p.add(ServiceNodo.to_Nodo(e));
		}
		return p;
	}
	
	public static ListaEncadeadaDupla getListaEncadeadaDupla(String link) throws FileNotFoundException {
		ListaEncadeadaDupla p = new ListaEncadeadaDupla();
		fi = ServiceProduto.class.getResourceAsStream(link);
		Scanner in = new Scanner(fi);
		while (in.hasNextLine()) {
		    String line[] = in.nextLine().split(";");
		    Produto e = new Produto(line[0], Double.parseDouble(line[1]));
		    p.add(ServiceNodo.to_Nodo(e));
		}
		return p;
	}
	
	public static ArvoreBin getArvore(String link) throws FileNotFoundException {
		 ArvoreBin p = new  ArvoreBin();
		fi = ServiceProduto.class.getResourceAsStream(link);
		Scanner in = new Scanner(fi);
		int i = 1;
		while (in.hasNextLine()) {
		    String line[] = in.nextLine().split(";");
		    double b = Double.parseDouble(line[1]);
		    Produto e = new Produto(line[0], b);
		    
		    p.add(ServiceNodo.to_Nodo(e,(int)b), (int)b);
		    i+=1;
		}
		return p;
	}
	
}
