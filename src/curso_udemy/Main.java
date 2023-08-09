package curso_udemy;

public class Main {

	public static void main(String[] args) {
	/* 	%f = ponto flutuante
		%d = inteiro
		%s = texto
		%n = quebra de linha */

		System.out.println("Olá mundo");
		System.out.println("Bom dia");
		int x = 20;
		double y = 23.112001;
		System.out.printf("%.2f%n", y);
		System.out.printf("%.4f%n", y);
		System.out.println(x);
		System.out.println("Resultado = " + y + " metros");
		System.out.printf("Resultado = %f metros e %d km", y, x);

	}

}
