package aula_05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Matheus");
		pilha.add("Aline");
		pilha.add("Pedro");
		pilha.add("Maria");
		pilha.push("Vinicius");
		pilha.push("Renato");
		
		System.out.println(pilha);
		
		// métodos de pilha : 
		
		// pop -> remove do "topo", ou seja, do final da lista
		pilha.pop();
		System.out.println(pilha);
	}

}
