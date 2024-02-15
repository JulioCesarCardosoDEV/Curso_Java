package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {
	private LocalDate dataDeFabricacao;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, double preco, LocalDate dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public LocalDate getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricacao(LocalDate dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	
	@Override
	public String priceTag() {
		return getNome() + " (used) $ " + String.format("%.2f", getPreco()) + " (Data de fabricação: " + dataDeFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
	}
}
