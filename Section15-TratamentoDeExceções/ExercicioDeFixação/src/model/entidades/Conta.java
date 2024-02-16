package model.entidades;

import model.exception.ExceptionConta;

public class Conta {
	private Integer numero;
	private String titular;
	private double saldo;
	private double limiteDeSaque;
	
	public Conta() {
		
	}
	
	public Conta(Integer numero, String titular, double saldo, double limiteDeSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}

	public void realizarDeposito(double quantia) {
		this.saldo += quantia;
	}
	
	public void realizarSaque(double quantia) {
		validarQuantia(quantia);
		this.saldo -= quantia;
	}
	
	private void validarQuantia(double quantia) {
		if(quantia > getLimiteDeSaque()) {
			throw new ExceptionConta("Erro de saque: A quantia excede o limite de saque");
		}
		
		if(quantia > getSaldo()) {
			throw new ExceptionConta("Erro de saque: Saldo insuficiente");
		}
	}
	
	
}
