package aplicacao;
import entidades.Conta;
import entidades.ContaPoupança;
import entidades.ContaPremium;

public class Programa {

	public static void main(String[] args) {
		Conta x = new Conta(1020, "Alex", 1000);
		Conta y = new ContaPoupança(1023, "Maria", 1000, 0.01);
		
		x.saque(50);
		y.saque(50);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
