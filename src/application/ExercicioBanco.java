package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class ExercicioBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Banco bc;
		
		System.out.print("Digite o número da conta: ");
		int conta = sc.nextInt();
		System.out.print("Digite o nome do cliente: ");
		sc.nextLine();
		String cliente = sc.nextLine();
		System.out.print("Depósito inicial? (s/n) ");
		char resp = sc.next().charAt(0);
		
		if (resp == 's') {
			System.out.print("Digite o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			bc = new Banco(conta, cliente, depositoInicial);
		}
		
		else {
			bc = new Banco(conta, cliente);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(bc);

		System.out.println();
		System.out.print("Digite o valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		bc.deposito(valorDeposito);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(bc);
		
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		double valorSaque = sc.nextDouble();
		bc.saque(valorSaque);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(bc);
		
		
		sc.close();

	}

}
