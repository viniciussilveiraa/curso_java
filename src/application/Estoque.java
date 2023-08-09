package application;

import java.util.Locale;
import java.util.Scanner; 

import entities.Produto;

public class Estoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preco: ");
		double preco = sc.nextDouble();
		
		Produto pdt = new Produto(nome, preco);
		
		pdt.setNome("Computador");
		System.out.println("Nome atualizado: " + pdt.getNome());
		pdt.setPreco(1200.00);
		System.out.println("Preço atualizado: " + pdt.getPreco());
		
		
		System.out.println();
		System.out.println("Dados do produto:" + pdt);
		
		System.out.println();
		System.out.print("Digite o número de produtos para serem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		pdt.adicionarProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados do produto:" + pdt);
		
		System.out.println();
		System.out.print("Digite o número de produtos para serem removidos do estoque: ");
		quantidade = sc.nextInt();
		pdt.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados do produto:" + pdt);
		
		sc.close();
		
	}

}
