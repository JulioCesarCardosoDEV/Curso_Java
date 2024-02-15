package entidades;

public class Conta {
	private Integer numero;
	private String titular;
	protected double balance;
	
	public Conta() {
		
	}
	
	public Conta(Integer numero, String titular, double balance) {
		this.numero = numero;
		this.titular = titular;
		this.balance = balance;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getBalance() {
		return balance;
	}
	
	public void saque(double quantia) {
		balance -= quantia + 5;
	}
	
	public void deposito(double quantia) {
		balance += quantia;
	}
	
	
}
