package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ExercícioFuncionário {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario fnc = new Funcionario();
		
		System.out.print("Nome do funcionário: ");
		fnc.nome = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		fnc.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto pago: ");
		fnc.imposto = sc.nextDouble();
		
		System.out.printf("Funcionário: " + fnc);
		System.out.println();
		
		System.out.println("Qual porcentagem deseja aumentar ao salário?");
		double porcentagem = sc.nextDouble();
		fnc.aumentoSalario(porcentagem);
		
		System.out.println("Dados atualizados: ");
		System.out.printf("Funcionário: " + fnc);
		
	
		
		
		
		
		sc.close();
	}

}
