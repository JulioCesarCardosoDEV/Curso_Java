import entidades.Conta;
import entidades.ContaPoupança;
import entidades.ContaPremium;

public class Programa {

	public static void main(String[] args) {
		Conta conta = new Conta(1001, "Alex", 0);
		ContaPremium contaP = new ContaPremium(1002, "Maria", 0, 500);
		
		//UPCASTING
		
		Conta conta1 = contaP;
		Conta conta2 = new ContaPremium(1003, "Bob", 0, 200);
		Conta conta3 = new ContaPoupança(1004, "Ana", 0, 0.01);
		
		// DOWNCASTING
		
		ContaPremium conta4 = (ContaPremium)conta2;
		conta4.realizarEmprestimo(100);
		
		if(conta3 instanceof ContaPremium) {
			ContaPremium conta5 = (ContaPremium)conta3;
			conta5.realizarEmprestimo(200);
			System.out.println("Empréstimo realizado!");
			System.out.println(conta5.getTitular());
		}
		
		if(conta3 instanceof ContaPoupança) {
			ContaPoupança conta5 = (ContaPoupança)conta3;
			conta5.atualizarSaldo();;
			System.out.println("Saldo atualizado!");
		}
	}

}
