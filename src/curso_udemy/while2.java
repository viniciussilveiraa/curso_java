package curso_udemy;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x!=0 || y!=0) {
			
			
			
			if (x>0 && y>0) {
				System.out.println("Primeiro quadrante");
				
			}
			if (x>0 && y<0) {
				System.out.println("Quarto quadrante");
				
			}
			if (x<0 && y<0) {
				System.out.println("Terceiro Quadrante");
				
			}
			if (x<0 && y>0) {
				System.out.println("Segundo Quadrante");
				
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
		 
		 
		
				

	}

}