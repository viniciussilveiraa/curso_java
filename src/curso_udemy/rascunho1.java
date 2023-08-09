package curso_udemy;

import java.util.Scanner;

public class rascunho1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x!=0 || y!=0) {
			
			
			
			if (x>0 && y>0) {
				System.out.println("Primeiro quadrante");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			if (x>0 && y<0) {
				System.out.println("Quarto quadrante");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			if (x<0 && y<0) {
				System.out.println("Terceiro Quadrante");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			if (x<0 && y>0) {
				System.out.println("Segundo Quadrante");
				x = sc.nextInt();
				y = sc.nextInt();
			}
		}
		
		sc.close();
		 
		 
		
				

	}

}
