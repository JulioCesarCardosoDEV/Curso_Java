package application;

import java.util.Locale;
import java.util.Scanner;
import entidades.produtos;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Entre com o product data: ");
		System.out.print("Digite o nome do produto: ");
		String nome = sc.nextLine();
		System.out.print("Digite o preço: ");
		double preco = sc.nextDouble();
		System.out.print("Digite a quantidade de produtos: ");
		int quantidade = sc.nextInt();
		
		produtos produto = new produtos(nome, preco, quantidade);
		System.out.println();
		System.out.println("Product data: " + produto);
		
		System.out.println();
		System.out.print("Entre com o número de produtos que serão adicionados ao estoque: ");
		int Adicionarquantidade = sc.nextInt();
		produto.adicionarProduto(Adicionarquantidade);
		System.out.println();
		System.out.println("Product data: " + produto);
		
		System.out.println();
		System.out.print("Entre com o número de produtos que foram vendidos: ");
		Adicionarquantidade = sc.nextInt();
		produto.subtrairProduto(Adicionarquantidade);
		System.out.println();
		System.out.print("Product data: " + produto);
		
		sc.close();

	}

}
