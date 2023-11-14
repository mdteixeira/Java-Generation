package exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Integer> meuSet = new HashSet<Integer>();

		meuSet.add(2);
		meuSet.add(5);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(4);
		meuSet.add(9);
		meuSet.add(7);
		meuSet.add(8);
		meuSet.add(10);
		meuSet.add(6);

		System.out.print("Digite o número que você deseja encontrar >> ");
		int procurar = sc.nextInt();

		if (meuSet.contains(procurar))
			System.out.printf("O número %d foi encontrado!", procurar);
		else
			System.out.printf("O número %d não foi encontrado!", procurar);

	}

}
