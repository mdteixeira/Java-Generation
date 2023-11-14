package aula_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		// ArrayList 
		ArrayList<Double> notas = new ArrayList<Double>();
		
		// Adicionar elementos na ArrayList
		notas.add(7.0);
		notas.add(5.5);
		notas.add(8.5);
		
		// alguns dos metodos de arraylist
		notas.get(0); // retorna: 7.0
		notas.indexOf(7.0); // retorna: 0
		notas.contains(8.5); // retorna: true
		
		System.out.println(notas);
	
		// ---------------------------------------------- //
		// Set
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Abacate");
		frutas.add("Morango");
		frutas.add("Ameixa");
		frutas.add("Maçã");
		
		System.out.println(frutas);
		
		for(var fruta : frutas) {
			System.out.println(fruta + " = " + fruta.hashCode());
		}
		
		frutas.contains("Abacate"); // retorna: true
		frutas.remove("Morango"); // remove o item do set
		
		Iterator<String> iFrutas = frutas.iterator();
		
		while(iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}
		
	}

}
