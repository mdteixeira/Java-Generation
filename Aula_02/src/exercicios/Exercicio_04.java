package exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Número 1 : ");
		n1 = leia.nextFloat();
		System.out.println("Número 2: ");
		n2 = leia.nextFloat();
		System.out.println("Número 3: ");
		n3 = leia.nextFloat();
		System.out.println("Número 4 : ");
		n4 = leia.nextFloat();
				
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença : " + diferenca);

	}

}
