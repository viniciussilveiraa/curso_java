package curso_udemy;

import java.util.Scanner;

public class condicional1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero >= 0) { 
			System.out.println("O número é positivo!");
		}
		else {
			System.out.println("O número é negativo!");
		}
		sc.close();
	}

}
