package exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Integer> meuSet = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.print("Insira um número >> ");
			meuSet.add(sc.nextInt());
		}

		for (int numero : meuSet) {
			System.out.println(numero);
		}

	}

}
