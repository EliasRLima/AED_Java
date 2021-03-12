package teste;

import java.io.FileNotFoundException;

import Estruturas.ArvoreBin;
import Estruturas.Fila;
import Estruturas.ListaEncadeadaDupla;
import Estruturas.Pilha;
import ProblemaProduto.Produto;
import ProblemaProduto.ServiceNodo;
import ProblemaProduto.ServiceProduto;

public class TesteProdutos {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		long tempoInicial = System.currentTimeMillis();
		
		Pilha pilha = ServiceProduto.getPilha("/ProblemaProduto/produtos.txt");
		Fila fila = ServiceProduto.getFila("/ProblemaProduto/produtos.txt");
		ArvoreBin arvore = ServiceProduto.getArvore("/ProblemaProduto/produtos.txt");
		
		System.out.println("########## ESTOQUE ATUAL ###############");
		ServiceNodo.list(fila);
		ServiceNodo.list(pilha);
		ServiceNodo.list(arvore);
		
		pilha.remove();
		fila.remove();
		arvore.remove();
		
		System.out.println("\n\n\n########## ESTOQUE POS VENDA ###############");
		ServiceNodo.list(fila);
		ServiceNodo.list(pilha);
		ServiceNodo.list(arvore);
		
		
		System.out.println("\n\n\n\no metodo executou em " + (System.currentTimeMillis() - tempoInicial));

	}

}



