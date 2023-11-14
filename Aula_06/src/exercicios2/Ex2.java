package exercicios2;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class Ex2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int continuar = 0;

		Stack<String> fila = new Stack<String>();

		do {

			System.out.println("\n*******************************************");
			System.out.println("");
			System.out.println("\t1 - Adicionar Cliente na Fila");
			System.out.println("\t2 - Listar todos os Clientes");
			System.out.println("\t3 - Retirar Cliente da Fila");
			System.out.println("\t0 - Sair");
			System.out.println("");
			System.out.println("*******************************************\n");

			System.out.print("\nEntre com a opção desejada >>> ");
			continuar = sc.nextInt();

			switch (continuar) {
			case 1:
				System.out.print("\nDigite o nome: ");
				fila.add(sc.next());
				break;
			case 2:
				if (!fila.isEmpty()) {
					System.out.println("\nLista de Clientes na Fila: \n");
					for (var pessoa : fila) {
						System.out.println(pessoa);
					}
				} else
					System.out.println("\n*** A fila está vazia! ***");
				break;
			case 3:
				System.out.println("\nO cliente " + fila.pop() + " foi chamado!");
				break;
			case 0:
				System.out.println("\nPrograma finalizado!");
			}

		} while (continuar != 0);

	}

}
