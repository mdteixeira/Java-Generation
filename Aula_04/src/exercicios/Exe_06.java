package exercicios;

import java.util.Scanner;

public class Exe_06 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero = 0, contador = 0;
		float soma = 0.0f, media = 0.0f;
		
		do {
			System.out.println("Digite um nuumero: ");
			numero = sc.nextInt();
			
			if(numero %3 ==0 && numero != 0) {
				soma+=numero; 
				contador++;
		}
		} while(numero != 0);

		media = soma / contador;
		
		System.out.println("A média de todos os multiplos de 3 é : " + media);
	}

}
