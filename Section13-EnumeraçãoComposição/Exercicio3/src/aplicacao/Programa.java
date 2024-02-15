package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Ordem;
import entidades.OrdemDoPedido;
import entidades.Produto;
import entidades.enums.statusDoPedido;

public class Programa {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nomeDoCliente = sc.nextLine();
		System.out.print("Email: ");
		String emailDoCliente = sc.nextLine();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date dataDeNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nomeDoCliente, emailDoCliente, dataDeNascimento);
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		String StatusDoPedido = sc.next();
		System.out.print("Quantos itens você pediu? ");
		int quantidadeDeItens = sc.nextInt();
		
		Ordem ordem = new Ordem(new Date(), statusDoPedido.valueOf(StatusDoPedido) , cliente);
		
		for(int i = 0; i<quantidadeDeItens; i++) {
			System.out.println("Entre com os dados do #" +(i+1) + " pedido: ");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeDoProduto = sc.nextLine();
			System.out.print("Preco do produto: ");
			double precoDoProduto = sc.nextDouble();
			
			Produto produto = new Produto(nomeDoProduto, precoDoProduto);
			
			System.out.print("Quantidade: ");
			int quantidadeDoProduto = sc.nextInt();
			
			OrdemDoPedido ordemDoPedido = new OrdemDoPedido(quantidadeDoProduto, precoDoProduto, produto);
		
			ordem.adicionarItem(ordemDoPedido);
		}
		
		System.out.println();
		System.out.println("Sumário do pedido: ");
		System.out.println(ordem);
		
		
		sc.close();
	}
}	
