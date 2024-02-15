package aplicacao;
import java.util.ArrayList;
import java.util.List;

import entidades.Conta;
import entidades.ContaPoupança;
import entidades.ContaPremium;

public class Programa {

	public static void main(String[] args) {
		List<Conta>lista = new ArrayList<>();
		
		lista.add(new ContaPoupança(1001, "Alex", 500, 0.01));
		lista.add(new ContaPremium(1002, "Maria", 1000, 400));
		lista.add(new ContaPoupança(1004, "Carlos", 300, 0.01));
		lista.add(new ContaPremium(1005, "Anna", 500, 500));
		
		double soma = 0;
		
		for(Conta acc : lista) {
			soma+= acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", soma);
		
		for(Conta acc : lista) {
			acc.deposito(10);
		}
		for(Conta acc : lista) {
			System.out.printf("Balance atualizada %d: %.2f%n", acc.getNumero(), acc.getBalance());
		}
	}

}
