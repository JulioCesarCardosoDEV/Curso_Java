package entidades;

public class Produtos {
	private String nome; 
	private double preco;
	
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setPreco(double novoPreco) {
		this.preco = novoPreco;
	}
}
