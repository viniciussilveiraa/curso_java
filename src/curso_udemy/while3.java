package curso_udemy;

import java.util.Scanner;

public class while3 {

	public static void main(String[] args) {
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int tipo = sc.nextInt();
		
		while (tipo!=4) {
			if (tipo == 1) {
				alcool += 1;
			}
			else if (tipo == 2) {
				gasolina += 1;
			}
			else if (tipo == 3) {
				diesel += 1;
			}
			tipo = sc.nextInt();
		}
			
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool :"+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		
		
		
		sc.close();
		
		
		

	}

}
