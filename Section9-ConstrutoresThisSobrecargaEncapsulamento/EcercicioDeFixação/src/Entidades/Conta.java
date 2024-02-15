package Entidades;

public class Conta {
	private int numeroDaConta;
	private String nomeDoTitular;
	private double saldoConta;
	
	public Conta(int numeroDaConta, String nomeDoTitular) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public Conta(int numeroDaConta, String nomeDoTitular, double depositoInicial){
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		realizaDeposito(depositoInicial);
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}
	
	public void setNomeDoTitular(String nome) {
		this.nomeDoTitular = nome;
	}

	public double getDepositoInicial() {
		return saldoConta;
	}

	public void realizaDeposito(double deposito) {
		this.saldoConta += deposito;
	}
	
	public void realizarSaque(double saque) {
		this.saldoConta -= saque + 5;
	}
	
	public String toString(){
		return "Conta " + numeroDaConta + ", Titular: " + nomeDoTitular + ", Saldo: $ " + String.format("%.2f", saldoConta);
	}
}