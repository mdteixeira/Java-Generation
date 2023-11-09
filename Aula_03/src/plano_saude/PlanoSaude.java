package plano_saude;

import java.util.Scanner;

public class PlanoSaude {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String nome;
		int idade;

		System.out.print("Insira seu nome : ");
		nome = leia.nextLine();

		System.out.print("\nInsira sua idade : ");
		idade = leia.nextInt();

		if (idade > 0 && idade <= 10) {
			System.out.printf("%s O seu plano de saúde custará R% 100,00 por mês", nome);
		} else if (idade > 10 && idade <= 29) {
			System.out.print("O seu plano de saúde custará R% 200,00 por mês");
		} else if (idade > 29 && idade <= 45) {
			System.out.print("O seu plano de saúde custará R% 300,00 por mês");
		} else if (idade > 45 && idade <= 59) {
			System.out.print("O seu plano de saúde custará R% 500,00 por mês");
		} else if (idade > 59 && idade <= 65) {
			System.out.print("O seu plano de saúde custará R% 600,00 por mês");
		} else {
			System.out.print("O seu plano de saúde custará R% 1000,00 por mês");
		}

	}

}
