 package exercicios;

import java.util.Scanner;

public class Exe_01 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int inicioIntervalo, finalIntervalo;
		
		System.out.print("Digite o primeiro número do intervalo: ");
		inicioIntervalo = sc.nextInt();
		System.out.print("Digite o último número do intervalo: ");
		finalIntervalo = sc.nextInt();
		
		if (finalIntervalo < inicioIntervalo) {
			System.out.println("Intervalo inválido!");
		}
		System.out.printf("\nNo intervalo entre %d e %d:\n", inicioIntervalo, finalIntervalo);
		for (int i = inicioIntervalo; i < finalIntervalo; i++) {
			if (i%3==0 && i%5==0) {
				System.out.printf("\n%s é múltiplo de 3 e 5", i);
			}
		}
	}

}
