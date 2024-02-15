package entidades;

public class Notas {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double calculoNota() {
		return nota1 + nota2 + nota3;
	}
	
	public double pontosQueFaltaram() {
		if(calculoNota() < 60.0) {
			return 60.0 - calculoNota();
		}else
			return 0.0;
	}
}
