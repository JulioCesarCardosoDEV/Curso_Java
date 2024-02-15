import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class Programa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de produtos: ");
		int quantidadeDeProdutos = sc.nextInt();
		Produtos[] produtos = new Produtos[quantidadeDeProdutos];
		
		double soma = 0;
		
		for(int i=0; i<produtos.length; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do produto: ");
			String nome = sc.nextLine();
			
			System.out.print("Digite o preco do produto: ");
			double preco = sc.nextDouble();
			
			produtos[i] = new Produtos(nome, preco);
			
			soma += produtos[i].getPreco();
		}
		
			double media = soma/quantidadeDeProdutos;
		
			System.out.printf("MEDIA: %.2f", media);
			
			
		sc.close();

	}

}
