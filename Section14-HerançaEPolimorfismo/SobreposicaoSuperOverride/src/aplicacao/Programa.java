package aplicacao;
import entidades.Conta;
import entidades.ContaPoupança;
import entidades.ContaPremium;

public class Programa {

	public static void main(String[] args) {
		Conta conta1 = new Conta(1001, "Alex", 1000);
		conta1.saque(200);
		System.out.println(conta1.getBalance());
		
		Conta conta2 = new ContaPoupança(1002, "Bob", 1000, 0.01);
		conta2.saque(200);
		System.out.println(conta2.getBalance());
		
		Conta conta3 = new ContaPremium(1003, "Ana", 1000, 500);
		conta3.saque(200);
		System.out.println(conta3.getBalance());
	}

}
