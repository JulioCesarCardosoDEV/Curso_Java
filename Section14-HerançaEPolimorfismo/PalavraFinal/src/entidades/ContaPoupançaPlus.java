package entidades;

public class ContaPoupançaPlus extends ContaPoupança {
	@Override
	public void saque(double quantia) {
		balance -= quantia + 2;
	}
}
