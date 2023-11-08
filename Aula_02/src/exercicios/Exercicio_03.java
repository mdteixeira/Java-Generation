package exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Salário Bruto : ");
		salarioBruto = leia.nextFloat();
		System.out.println("Adicional Noturno : ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Horas Extras : ");
		horasExtras = leia.nextFloat();
		System.out.println("Descontos : ");
		descontos = leia.nextFloat();
				
		salarioLiquido = salarioBruto+adicionalNoturno+(horasExtras*5)-descontos;
		
		System.out.println("Salário Líquido : " + salarioLiquido);

	}

}
