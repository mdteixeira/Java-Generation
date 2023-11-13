package exercicios;

import java.util.Scanner;

public class Exe_04 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double[][] notas = new double[10][4];
		double[] medias = new double[10];
		double soma, media = 0;

		for (int i = 0; i < notas.length; i++) {
			soma = 0;
			media = 0;
			System.out.println("---------------");
			System.out.printf("*** Aluno %d ***\n", i+1);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.printf("%d° nota : ", j + 1, i + 1);
				notas[i][j] = sc.nextDouble();
				soma+=notas[i][j];
			}
			media=soma/4;
			medias[i]=media;
		}
		System.out.print("\n|");
		for(double mediaAluno : medias) {
			System.out.print(mediaAluno + "|");
		}
	}

}
