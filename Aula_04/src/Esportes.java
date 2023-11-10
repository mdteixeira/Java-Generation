import java.util.Scanner;

public class Esportes {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, esporte;
		int futebol = 0, volei = 0, basquete = 0, outros = 0;

		String continua = "s";

		while (continua.equalsIgnoreCase("s")) {

			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();

			System.out.println("Digite o seu Esporte Favorito");
			System.out.println("1 - Futebol");
			System.out.println("2 - Volei");
			System.out.println("3 - Basquete");
			System.out.println("4 - Outros: ");

			esporte = sc.nextInt();

			switch (esporte) {
			case 1:
				futebol++;
				break;
			case 2:
				if (idade > 18) volei++;
				break;
			case 3:
				if (idade < 18) basquete++;
				break;
			case 4:
				outros++;
			default:
				System.out.println("Esporte inválido.");
			}
			System.out.println("Deseja continuar? (S/N)");
			sc.skip("\\R");
			continua = sc.nextLine().toLowerCase();
		}
		System.out.println("\n----- Votos -----");
		System.out.println("Futebol : " + futebol);
		System.out.println("Volei e maior de 18 anos : " + volei);
		System.out.println("Basquete e menor de 18 anos : " + basquete);
		System.out.println("Outros esportes : " + outros);
	}

}
