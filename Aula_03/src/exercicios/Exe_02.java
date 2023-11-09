package exercicios;

import java.util.Scanner;

public class Exe_02 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero%2 == 0) {
			System.out.printf("O número %d é par", numero);
		}
		else {
			System.out.printf("O número %d é ímpar", numero);
		}
		
		if (numero > 0) {
			System.out.printf(" e positivo!", numero);
		}
		else {
			System.out.printf(" e negativo!", numero);
		}
		
	}
}
