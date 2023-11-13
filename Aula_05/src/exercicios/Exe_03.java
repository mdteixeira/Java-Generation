package exercicios;

import java.util.Scanner;

public class Exe_03 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int somaDP = 0, somaDS = 0;

		int[][] matriz = new int[3][3];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("Matriz[" + i + "][" + j + "] = ");
				matriz[i][j] = sc.nextInt();
			}
		}
		// diagonal principal
		System.out.println("Elementos da Diagonal Principal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
			somaDP += matriz[i][i];
		}

		// diagonal secundaria
		System.out.println("\n\nElementos da Diagonal secundária: ");
		int j = 2;
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][j] + " ");
			j--;
			somaDS += matriz[i][i];
		}

		System.out.println("\n\nSoma dos Elementos da Diagonal Principal: " + somaDP);
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaDS);
	}

}
