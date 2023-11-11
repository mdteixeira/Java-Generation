package exercicios;

import java.util.Scanner;

public class Exe_05 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero = 0;
		float soma = 0.0f;
		
		do {
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();
			
			if(numero > 0) soma+=numero; 
			
		} while(numero != 0);
		
		System.out.println("A soma dos números positivos é : " + soma);
	}

}
