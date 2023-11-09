package plano_saude;

import java.util.Scanner;

public class PlanoSaude_v2 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String nome;
		int faixaEtaria;

		System.out.print("Insira seu nome : ");
		nome = leia.nextLine();

		System.out.println("Faixas etárias : ");
		System.out.println("1 - De 0 a 10 anos");
		System.out.println("2 - De 11 a 29 anos");
		System.out.println("3 - De 30 a 45 anos");
		System.out.println("4 - De 46 a 59 anos");
		System.out.println("5 - De 60 a 65 anos");
		System.out.println("6 - Acima de 65 anos");
		System.out.print("\nInsira sua faixa etária : ");
		faixaEtaria = leia.nextInt();

		switch (faixaEtaria) {
		case 1:
			System.out.printf("%s, O seu plano de saúde custará R$100,00 por mês.", nome);
			break;
		case 2:
			System.out.printf("%s, O seu plano de saúde custará R$200,00 por mês.", nome);
			break;
		case 3:
			System.out.printf("%s, O seu plano de saúde custará R$300,00 por mês.", nome);
			break;
		case 4:
			System.out.printf("%s, O seu plano de saúde custará R$500,00 por mês.", nome);
			break;
		case 5:
			System.out.printf("%s, O seu plano de saúde custará R$600,00 por mês.", nome);
			break;
		case 6:
			System.out.printf("%s, O seu plano de saúde custará R$1000,00 por mês.", nome);
			break;
		default:
			System.out.print("Faixa etária inválida!");

		}
	}
}
