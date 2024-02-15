package entidades;

public class empregado {
	private int id;
	private String nome;
	private double salario;
	
	public empregado() {
		
	}
	
	public empregado(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int novoId) {
		this.id = novoId;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double novoSalario) {
		this.salario = novoSalario;
	}
	
	public void salarioAcrescentado(double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	
	public String toString() {
		return id + ", " + nome +", " + String.format("%.2f", salario);
	}
	
}
