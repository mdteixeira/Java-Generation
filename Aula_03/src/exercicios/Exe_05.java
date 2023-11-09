package exercicios;

import java.util.Scanner;

public class Exe_05 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idProduto, quantidade, precoFinal;
		
		System.out.println("Insira o produto : ");
		
		idProduto = leia.nextInt();
		System.out.println("Insira a quantidade : ");
		quantidade = leia.nextInt();
		
		switch(idProduto) {
		
		case 1:
			System.out.println("Produto: Cachorro Quente");
			precoFinal = 10*quantidade;
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			precoFinal = 15*quantidade;
			break;
		case 3:
			System.out.println("Produto: X-Bacon");
			precoFinal = 18*quantidade;
			break;
		case 4:
			System.out.println("Produto: Bauru");
			precoFinal = 12*quantidade;
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			precoFinal = 8*quantidade;
			break;
		case 6:
			System.out.println("Produto: Suco de laranja");
			precoFinal = 13*quantidade;
			break;
		default:
			System.out.println("Produto inválido.");
			precoFinal = 0;
			
			
		}
		System.out.printf("Valor total: R$ %d,00", precoFinal);
		
	}

}
