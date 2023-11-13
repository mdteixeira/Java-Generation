package exercicios;

import java.util.Scanner;

public class Exe_02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double[] notas = new double[10];

		double soma = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Insira o %d° número : ", i + 1);
			notas[i] = sc.nextInt();
		}
		
		System.out.println("\nElementos nos índices ímpares: ");
		for (int i = 0; i < notas.length; i++) {
			if (i % 2 == 1) {
				System.out.print(notas[i] + " ");
			}
		}

		System.out.println("\nElementos pares: ");
		for (double item : notas) {
			soma += item;
			if (item % 2 == 0) {
				System.out.print(item + " ");
			}
		}
		System.out.println("\n\nSoma : " + soma);
		System.out.println("\nMédia : " + (soma / 10));

	}

}
