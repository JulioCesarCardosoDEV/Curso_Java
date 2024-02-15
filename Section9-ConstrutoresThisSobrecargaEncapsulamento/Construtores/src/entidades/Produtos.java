package entidades;

public class Produtos {
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		quantidade = 0;
	}
	
	public double valorDoEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void subtrairProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $ " + String.format("%.2f", valorDoEstoque());
	}
}
