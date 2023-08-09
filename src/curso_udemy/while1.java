package curso_udemy;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x!=2001) {
			System.out.println("Senha inválida!");
			x = sc.nextInt();
	
		}
		System.out.println("Senha correta!");
		
		sc.close();

	}

}
