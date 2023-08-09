package curso_udemy;

import java.util.Scanner;

public class condicional5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		if (codigo == 1) {
			double total = quantidade * 4;
			System.out.printf("O total foi: R$%.2f",total);
		}
		else if (codigo == 2) {
			double total = quantidade * 4.5;
			System.out.printf("O total foi: R$%.2f",total);
		}
		else if (codigo == 3) {
			double total = quantidade * 5;
			System.out.printf("O total foi: R$%.2f",total);
		}
		else if (codigo == 4) {
			double total = quantidade * 2;
			System.out.printf("O total foi: R$%.2f",total);
		}
		else if (codigo == 5) {
			double total = quantidade * 1.5;
			System.out.printf("O total foi: R$%.2f",total);
		}
		
		
		sc.close();
		

	}

}
