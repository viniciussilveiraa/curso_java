package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class VetorAula1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Vetor[] vect = new Vetor[n]; 
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Vetor(nome, preco);
		}
		
		double soma = 0.0;
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getPreco();
		}
		double media = soma / vect.length;
		System.out.printf("Média de preços: $%.2f%n", media);
		
		sc.close();
	}

}
