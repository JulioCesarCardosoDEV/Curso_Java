package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import model.entidades.Conta;
import model.exception.ExceptionConta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados da conta: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldoInicial = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limiteDeSaque = sc.nextDouble();
		
		Conta conta = new Conta(numero, titular, saldoInicial, limiteDeSaque);
		
		System.out.println();
		System.out.print("Entre com a quantia de saque: ");
		double quantia = sc.nextDouble();
		
		try {	
			conta.realizarSaque(quantia);
			System.out.printf("Saldo atualizado: %.2f%n", conta.getSaldo());
		}
		catch(ExceptionConta e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
