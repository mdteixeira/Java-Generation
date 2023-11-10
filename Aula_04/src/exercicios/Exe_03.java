package exercicios;

import java.util.Scanner;

public class Exe_03 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int menores21=0, maiores50=0, idade = 1;
		
		while(idade > 0) {
			System.out.print("Digite uma idade: ");
			idade = sc.nextInt();
			if (idade < 21 && idade > 0) {
				menores21++;
			}
			if (idade > 50) {
				maiores50++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menores21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);

	}
}
