package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.print("Insira uma cor >> ");
			cores.add(sc.nextLine());
		}

		System.out.println("\nTodas as cores : ");
		for (var cor : cores) {
			System.out.println(cor);
		}

		cores.sort(null);

		System.out.println("\nCores ordenadas : ");
		for (var cor : cores) {
			System.out.println(cor);
		}

	}

}
