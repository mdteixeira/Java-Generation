package exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite o salário : ");
		salario = leia.nextFloat();
		System.out.println("Digite o abono : ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("O novo salário é de R$ " + novoSalario);

	}

}
