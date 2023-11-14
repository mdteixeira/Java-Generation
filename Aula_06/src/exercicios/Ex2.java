package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int procurar;

		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(2);
		lista.add(5);
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		lista.add(7);
		lista.add(8);
		lista.add(10);
		lista.add(6);
		
		System.out.print("Digite o número que você deseja encontrar >> ");
		procurar = sc.nextInt();
		
		if(lista.contains(procurar)) {
			System.out.printf("\nO número %d está localizado na posição: %d", procurar, lista.indexOf(procurar));
		}
		else System.out.printf("\nO número %d não foi encontrado!", procurar);

	}

}
