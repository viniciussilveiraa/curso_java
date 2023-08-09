package curso_udemy;

import java.util.Scanner;

public class for4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			int numerador = sc.nextInt();
			int denominador = sc.nextInt();
			if (denominador==0) {
				System.out.println("Divisão impossível");
			}
			else {
				double divisao = (double) numerador/denominador;
				System.out.printf("%.1f%n",divisao);
			}
		
		}
		
sc.close();
	}

}
