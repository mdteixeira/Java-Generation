package exercicios;

import java.util.Scanner;

public class Exe_01 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a, b, c;
		
		System.out.println("Insira o primeiro valor : ");
		a = leia.nextInt();
		System.out.println("Insira o segundo valor : ");
		b = leia.nextInt();
		System.out.println("Insira o terceiro valor : ");
		c = leia.nextInt();
		
		if (a+b > c) {
			System.out.println("A soma de A+B é Maior do que C");
		}
		else if (a+b < c) {
			System.out.println("A soma de A+B é Menor do que C");
		}
		else if (a+b == c) {
			System.out.println("A soma de A+B é Igual a C");
		}
	}
}
