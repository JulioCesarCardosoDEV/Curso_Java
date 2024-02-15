package entidades;

public class Funcionario {
	public String nome;
	public double salario;
	public double imposto;
	
	public double salarioLiquido() {
		return salario - imposto;
	}
	
	public double aumentoDeSalario(double salario) {
		return this.salario += (this.salario / salario);
	}
	
	public String dadosFuncionario() {
		return "Funcionario: " + nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
	
	public String toString() {
		return "Versão atualizada: " + nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
}
