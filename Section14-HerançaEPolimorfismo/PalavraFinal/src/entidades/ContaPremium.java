package entidades;

public class ContaPremium extends Conta{
	private double limiteDeEmprestimo;
	
	public ContaPremium() {
		super();
	}
	
	public ContaPremium(Integer numero, String titular, double balance, double limiteDeEmprestimo) {
		super(numero, titular, balance);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public void realizarEmprestimo(double quantia) {
		if(quantia <= limiteDeEmprestimo) {
			balance += quantia - 10;
		}
	}
	
	@Override
	public void saque(double quantia) {
		super.saque(quantia);
		balance += 2;
	}
}
