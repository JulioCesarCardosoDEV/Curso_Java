package entidades;

public class PessoaFisica extends Contribuintes {
	private double gastosComSaude;
	
	public PessoaFisica(){
		super();
	}
	
	public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double imposto() {
		double taxaBasica = 0;
		if(getRendaAnual() < 2000) {
			taxaBasica = getRendaAnual() * 0.15;
		}
		else {
			taxaBasica = getRendaAnual() * 0.25;
		}
		
		taxaBasica -= getGastosComSaude() * 0.5;
		
		if(taxaBasica < 0) {
			taxaBasica = 0;
		}
		
		return taxaBasica;
	}
	
	
}
