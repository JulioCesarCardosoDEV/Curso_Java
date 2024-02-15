package entidades;

public class ContaPoupança extends Conta{
	private double taxaDeJuros;
	
	public ContaPoupança() {
		
	}

	public ContaPoupança(Integer numero, String titular, double balance, double taxaDeJuros) {
		super(numero, titular, balance);
		this.taxaDeJuros = taxaDeJuros;
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void atualizarSaldo() {
		balance += balance * taxaDeJuros;
	}
}
