package curso_udemy;

import java.util.Scanner;

public class sequencial1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		System.out.println("A soma dos dois números é = " + soma);
		
		sc.close();
		

	}

}
