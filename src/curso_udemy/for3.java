package curso_udemy;

import java.util.Scanner;

public class for3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testes = sc.nextInt();
		
		for (int i=0; i<testes; i++) {
			
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double C = sc.nextDouble();
			
			double ponderada = ((A*2)+(B*3)+(C*5))/10;
			System.out.printf("%.1f%n",ponderada);
			
		}
		
sc.close();
	}

}
