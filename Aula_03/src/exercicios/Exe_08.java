package exercicios;

import java.util.Scanner;

public class Exe_08 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int operacao;

		float valor, saldo = 1000;

		System.out.println("1 - Saldo\n2 - Saque\n3 - Depósito ");
		System.out.print("\nOperação: ");

		operacao = leia.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("Operação: Saldo");
			System.out.printf("Saldo: %.2f", saldo);
			break;
		case 2:
			System.out.println("Operação: Saque");
			System.out.println("Valor: ");
			valor = leia.nextFloat();
			if (valor > saldo) {
				System.out.println("Saldo Insuficiente!");
			} else {
				saldo -= valor;
				System.out.printf("Novo saldo: R$ %.2f", saldo);
			}
			break;
		case 3:
			System.out.println("Operação: Depósito");
			valor = leia.nextFloat();
			saldo += valor;
			System.out.printf("Novo saldo: R$ %.2f", saldo);
			break;
		
		default:
			System.out.println("Operação Inválida!");
		}
	}

}
