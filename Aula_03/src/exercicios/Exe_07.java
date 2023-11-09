package exercicios;

import java.util.Scanner;

public class Exe_07 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		float numero1, numero2;
		int operacao;
		System.out.print("Insira o primeiro número : ");
		numero1 = leia.nextFloat();
		System.out.print("Insira o segundo número : ");
		numero2 = leia.nextFloat();
		System.out.println("1 - Soma \n2 - subtração \n3 - multiplicação \n4 - Divisão");
		System.out.print("Insira a operação : ");
		operacao = leia.nextInt();

		switch(operacao) {
		case 1:
			System.out.println(numero1+numero2);
			break;
		case 2:
			System.out.println(numero1-numero2);
			break;
		case 3:
			System.out.println(numero1*numero2);
			break;
		case 4:
			System.out.println(numero1/numero2);
			break;
		default:
			System.out.println("Operação Inválida.");
		}
	}

}
