package exercicios;

import java.util.Scanner;

public class Exe_01 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] lista = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.print("Qual número você quer achar? >>> ");
		int procurar = sc.nextInt();
		boolean encontrou = false;

		for (int i = 0; i < lista.length; i++) {
			if (procurar == lista[i]) {
				System.out.printf("O número %d está localizado na posição: %d", procurar, i);
				encontrou = true;
			}
		}
		if (!encontrou) {
			System.out.printf("O número %d não foi encontrado!", procurar);
		}

	}
}
