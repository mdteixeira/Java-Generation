package aula_05;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		
		// ArrayList 
		ArrayList<Double> notas = new ArrayList<Double>();
		
		// Adicionar elementos na ArrayList
		notas.add(7.0);
		notas.add(5.5);
		notas.add(8.5);
		
		for (Double nota : notas)
			System.out.println(nota);
		
	}

}
