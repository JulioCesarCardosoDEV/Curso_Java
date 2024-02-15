package entidades;

public class Produtos {
	public String nome;
	public double preco;
	public int quantidade;
	
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
