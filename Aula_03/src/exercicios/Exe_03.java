package exercicios;

import java.util.Scanner;

public class Exe_03 {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite o Nome do doador: ");
		nome = leia.nextLine();
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		System.out.println("Primeira doação de sangue?");
		System.out.println("true ou false");
		primeiraDoacao = leia.nextBoolean();
		
		if (idade < 18 || idade > 70 || (idade > 60 && primeiraDoacao == true)) {
			System.out.printf("%s não está apto para doar sangue!", nome);
		}
		else {
			System.out.printf("%s está apto para doar sangue!", nome);
		}
		
	}

}
