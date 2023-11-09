package exercicios;

import java.util.Scanner;

public class Exe_06 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int salario, idCargo;
		String nome, cargo;
		
		System.out.println("Nome do Colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("Cargo: ");
		idCargo = leia.nextInt();

		System.out.println("Salario: ");
		salario = leia.nextInt();
		
		
		switch(idCargo) {
		
		case 1:
			cargo = "Gerente";
			salario+=salario*0.1;
			break;
		case 2:
			cargo = "Vendedor";
			salario+=salario*0.07;
			break;
		case 3:
			cargo = "Supervisor";
			salario+=salario*0.09;
			break;
		case 4:
			cargo = "Motorista";
			salario+=salario*0.06;
			break;
		case 5:
			cargo = "Estoquista";
			salario+=salario*0.05;
			break;
		case 6:
			cargo = "Técnico de TI";
			salario+=salario*0.08;
			break;
		default:
			System.out.println("Cargo inválido.");
			cargo = "";
			
			
		}
		System.out.printf("\nNome do colaborador: %s", nome);
		System.out.printf("\nCargo: %s", cargo);
		System.out.printf("\nSalário: R$ %d,00", salario);
		
	}

}
