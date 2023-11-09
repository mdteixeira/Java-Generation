package exercicios;

import java.util.Scanner;

public class Exe_04 {

	static Scanner leia = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		String parte1, parte2, parte3;
		
		parte1 = leia.nextLine();
		parte2 = leia.nextLine();
		parte3 = leia.nextLine();
		
		
		if (parte1.equalsIgnoreCase("vertebrado")) {
			if (parte2.equalsIgnoreCase("ave")) {
				if (parte3.equalsIgnoreCase("carnívoro")) {
					System.out.println("Águia");
				}
				else {
					System.out.println("Pomba");
				}
			}
			else {
				if (parte3.equalsIgnoreCase("onívoro")) {
					System.out.println("Homem");
				}
				else {
					System.out.println("Vaca");
				}
			}
			
		}
		else {
			
			if (parte2.equalsIgnoreCase("inseto")) {
				if (parte3.equalsIgnoreCase("herbívoro")) {
					System.out.println("Lagarta");
				}
				else {
					System.out.println("Pulga");
				}
			}
			else {
				if (parte3.equalsIgnoreCase("onivoro")) {
					System.out.println("Minhoca");
				}
				else {
					System.out.println("Sanguessuga");
				}
			}
			
		}

	}

}
