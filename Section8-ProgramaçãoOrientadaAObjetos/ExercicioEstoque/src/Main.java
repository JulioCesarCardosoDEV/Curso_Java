import java.util.Locale;
import java.util.Scanner;
import entidades.Produtos;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos produto = new Produtos();
		
		System.out.println("Entre com o product data: ");
		System.out.print("Digite o nome do produto: ");
		produto.nome = sc.nextLine();
		System.out.print("Digite o preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Digite a quantidade de produtos: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + produto);
		
		System.out.println();
		System.out.print("Entre com o número de produtos que serão adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		System.out.println();
		System.out.println("Product data: " + produto);
		
		System.out.println();
		System.out.print("Entre com o número de produtos que foram vendidos: ");
		quantidade = sc.nextInt();
		produto.subtrairProduto(quantidade);
		System.out.print("Product data: " + produto);
		
		sc.close();

	}

}
