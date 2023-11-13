package aula_05;

import java.util.Scanner;

public class Matrizes {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// declara matriz
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// percorre todos os itens da matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Matriz[" + i + "][" + j + "] = " + matriz[i][j]);
			}
		}

		System.out.println("---------------------------");

		Double[][] matrizDouble = new Double[3][3];

		for (int i = 0; i < matrizDouble.length; i++) {
			for (int j = 0; j < matrizDouble.length; j++) {
				System.out.print("Matriz[" + i + "][" + j + "] = ");
				matrizDouble[i][j] = sc.nextDouble();
			}
		}

		System.out.println("---------------------------");
		System.out.println("Matriz preenchida : \n");

		for (int i = 0; i < matrizDouble.length; i++) {
			for (int j = 0; j < matrizDouble.length; j++) {
				System.out.println("Matriz[" + i + "][" + j + "] = " + matrizDouble[i][j]);
			}
		}

		System.out.println("---------------------------");
		System.out.println("Matriz Irregular : \n");

		Double[][] matrizIrregular = new Double[2][3];

		for (int i = 0; i < matrizIrregular.length; i++) {
			for (int j = 0; j < matrizIrregular[i].length; j++) {
				System.out.print("Matriz[" + i + "][" + j + "] = ");
				matrizIrregular[i][j] = sc.nextDouble();
			}
			System.out.println("---------------------------");
		}
		for (int i = 0; i < matrizIrregular.length; i++) {
			for (int j = 0; j < matrizIrregular[i].length; j++) {
				System.out.println("Matriz[" + i + "][" + j + "] = " + matrizIrregular[i][j]);
			}
		}
		System.out.println("---------------------------");
		// forEach em matrizes
		for (Double[] vetor : matrizIrregular) {
			for (Double elemento : vetor) {
				System.out.println(elemento);
			}
		}

	}

}
