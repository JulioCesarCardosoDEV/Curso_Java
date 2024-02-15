package entidades;

public class ProdutoImportato extends Produto{
	private double custoAdicionalDaImportacao;
	
	public ProdutoImportato() {
		super();
	}

	public ProdutoImportato(String nome, double preco, double custoAdicionalDaImportacao) {
		super(nome, preco);
		this.custoAdicionalDaImportacao = custoAdicionalDaImportacao;
	}

	public double getCustoAdicionalDaImportacao() {
		return custoAdicionalDaImportacao;
	}

	public void setCustoAdicionalDaImportacao(double custoAdicionalDaImportacao) {
		this.custoAdicionalDaImportacao = custoAdicionalDaImportacao;
	}
	
	public double PrecoTotalDoProduto() {
		return getPreco() + custoAdicionalDaImportacao;
	}
	
	@Override
	public String priceTag() {
		return getNome() + " $ " + String.format("%.2f", PrecoTotalDoProduto()) + " (Taxa importação: $ " + String.format("%.2f", custoAdicionalDaImportacao) + ")";
	}
}
