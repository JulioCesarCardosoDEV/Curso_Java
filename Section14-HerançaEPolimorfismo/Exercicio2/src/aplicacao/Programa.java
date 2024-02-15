package aplicacao;

import java.net.PortUnreachableException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportato;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto>produtos = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos: ");
		int quantidadeDeProdutos = sc.nextInt();
		
		for(int i=0; i<quantidadeDeProdutos; i++) {
			System.out.println("Dados do produto #" + (i + 1) + ":");
			System.out.print("Produto comum, usado ou importanto (c/u/i)? ");
			char statusDoProduto = sc.next().charAt(0);
			
			if(statusDoProduto == 'i') {
				System.out.print("Nome: ");
				sc.nextLine();
				String nomeDoProduto = sc.nextLine();
				System.out.print("Preco: ");
				double precoDoProduto = sc.nextDouble();
				System.out.print("Taxa de importação: ");
				double taxaDoProduto = sc.nextDouble();
				
				produtos.add(new ProdutoImportato(nomeDoProduto, precoDoProduto, taxaDoProduto));
				
			}else if(statusDoProduto == 'c') {
				System.out.print("Nome: ");
				sc.nextLine();
				String nomeDoProduto = sc.nextLine();
				System.out.print("Preco: ");
				double precoDoProduto = sc.nextDouble();
				
				produtos.add(new Produto(nomeDoProduto, precoDoProduto)); 
			}else if(statusDoProduto == 'u') {
				System.out.print("Nome: ");
				sc.nextLine();
				String nomeDoProduto = sc.nextLine();
				System.out.print("Preco: ");
				double precoDoProduto = sc.nextDouble();
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				LocalDate dataDeFabricacaoDoProduto = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				produtos.add(new ProdutoUsado(nomeDoProduto, precoDoProduto, dataDeFabricacaoDoProduto));
			}
		}
		
		System.out.println();
		System.out.println("Etiquetas de preço: ");
		for(Produto prd : produtos) {
			System.out.println(prd.priceTag());
		}
		
		sc.close();

	}

}
