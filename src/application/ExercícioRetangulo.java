package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class ExercícioRetangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Digite a largura e altura do retângulo: ");
		ret.largura = sc.nextDouble();
		ret.altura = sc.nextDouble();
		
		System.out.printf("Área: %.2f%n", ret.area());
		System.out.printf("Perímetro: %.2f%n", ret.perimetro());
		System.out.printf("Diagonal: %.2f%n", ret.diagonal());
		
		
		
		sc.close();
	}

}
