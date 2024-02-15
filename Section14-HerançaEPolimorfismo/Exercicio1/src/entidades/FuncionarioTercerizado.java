package entidades;

public class FuncionarioTercerizado extends Funcionario{
	private double bonusAdicionado;
	
	public FuncionarioTercerizado() {
		super();
		
	}
	
	public FuncionarioTercerizado(String nome, Integer horas, double valorPorHora, double bonusAdicionado) {
		super(nome, horas, valorPorHora);
		this.bonusAdicionado = bonusAdicionado;
	}

	public double getBonusAdicionado() {
		return bonusAdicionado;
	}

	public void setBonusAdicionado(double bonusAdicionado) {
		this.bonusAdicionado = bonusAdicionado;
	}
	
	@Override
	public double valorPagamento() {
		return super.valorPagamento() + bonusAdicionado * 1.1;
	}
	
	
}
