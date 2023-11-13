package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] pessoas = { "Luiza", "Aline", "Samara", "Antonio", "Vinicius", "Vitor" };

		for (int indice = 0; indice < pessoas.length; indice++) {
			System.out.println("Posição : " + indice + " = " + pessoas[indice]);
		}
		
		System.out.println("-------------------");
		
		float[] notas = new float[5];
		
		/* for (int indice = 0; indice < notas.length; indice ++ ) {
			System.out.println("Digite um valor para a posição [" + indice + "] = ");
			notas[indice] = sc.nextFloat();
		}
		
		for (int indice = 0; indice < notas.length; indice++) {
			System.out.println("Posição : " + indice + " = " + notas[indice]);
		}

		Arrays.sort(notas);
		System.out.println("-------------------------");
		
		 for (int indice = 0; indice < notas.length; indice++) {
			System.out.println("Posição : " + indice + " = " + notas[indice]);
			}
		*/
		
		System.out.print("Localize 'Aline' no array : " + Arrays.binarySearch(pessoas, "Vinicius"));

	}

}
