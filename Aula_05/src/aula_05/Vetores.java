package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] pessoas = { "Luiza", "Aline", "Samara", "Antonio", "Vinicius", "Vitor" };

		// imprimir nomes do array 'pessoas'
		for (int indice = 0; indice < pessoas.length; indice++) {
			System.out.println("Posição : " + indice + " = " + pessoas[indice]);
		}

		System.out.println("-------------------");

		// declara um array vazio
		float[] notas = new float[5];

		// recebe um valor para cada posição do array
		for (int indice = 0; indice < notas.length; indice++) {
			System.out.println("Digite um valor para a posição [" + indice + "] = ");
			notas[indice] = sc.nextFloat();
		}

		// imprime o array, item por item
		for (int indice = 0; indice < notas.length; indice++) {
			System.out.println("Posição : " + indice + " = " + notas[indice]);
		}

		// ordena o array
		Arrays.sort(notas);
		System.out.println("-------------------------");

		for (int indice = 0; indice < notas.length; indice++) {
			System.out.println("Posição : " + indice + " = " + notas[indice]);
		}

		System.out.println("-------------------------");

		// localiza item no array
		System.out.println("Localize item no array : " + Arrays.binarySearch(pessoas, "Aline"));

		for (int indice = 0; indice < pessoas.length; indice++) {
			if (pessoas[indice].equalsIgnoreCase("Aline")) {
				System.out.println("Aline está na posição " + indice);
			}
		}
		// ForEach
		for (String pessoa : pessoas) {
			System.out.println(pessoa);
		}

	}

}
