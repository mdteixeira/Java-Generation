package exercicios;

import java.util.Scanner;

public class Exe_04 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, identidade, dev, total=0, idades=0, mCis=0, hCis=0, nB=0, mT=0, hT=0, outros=0;
		int backend=0, frontend=0, mobile=0, fullstack=0;
		int var1=0, var2=0, var3=0, var4=0;
		String continuar = "s";

		while (continuar.equalsIgnoreCase("s")) {
			System.out.print("Insira sua idade: ");
			idade = sc.nextInt();
			total++;
			idades+=idade;

			System.out.println("\n------\nIdentidade de Gênero: \r\n" + "1 – Mulher Cis\r\n" + "2 – Homem Cis\r\n"
					+ "3 – Não Binário\r\n" + "4 – Mulher Trans\r\n" + "5 – Homem Trans\r\n" + "6 – Outros\r\n" + "");
			identidade = sc.nextInt();

			System.out.println("Pessoa Desenvolvedora: \r\n" + "1 – Backend\r\n" + "2 – Frontend\r\n" + "3 – Mobile\r\n"
					+ "4 – FullStack\r\n" + "");
			dev = sc.nextInt();
			
			switch(identidade) {
			case 1:
				mCis++;
				break;
			case 2:
				hCis++;
				break;
			case 3:
				nB++;
				break;
			case 4:
				mT++;
				break;
			case 5:
				hT++;
				break;
			case 6:
				outros++;
				break;
			default:
				System.out.println("Gênero inserido inválido.");
			}
			switch(dev) {
			case 1:
				backend++;
				break;
			case 2:
				frontend++;
				break;
			case 3:
				mobile++;
			case 4:
				fullstack++;
			default:
				System.out.println("Área inserida inválida.");
			}
			
			if (dev==1) var1++;
			if ((identidade==1 || identidade==4) && dev==2) var2++;
			if ((identidade==2 || identidade==5) && dev==3 && idade>40) var3++;
			if (identidade==3 && dev==4 && idade<30) var4++;

			System.out.println("Continuar? (S/N)");
			continuar = sc.next();

		}
		float media = idades / total;
		System.out.printf(
				"-----------------------------------------------\n"+
				"O número de pessoas desenvolvedoras Backend: %s\r\n"
						+ "Mulheres Cis e Trans desenvolvedoras Frontend: %d\r\n"
						+ "Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos %d\r\n"
						+ "Não Binários desenvolvedores FullStack menores de 30 anos: %d\r\n"
						+ "Total de pessoas que responderam à pesquisa: %d\r\n"
						+ "Média de idade: %f\r\n",
						var1, var2, var3, var4, total, media
				);
	}

}
