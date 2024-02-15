package entidades;

public class Aluguel {	
	private String nome;
	private String email;
	
	public Aluguel() {
		
	}
	
	public Aluguel(String nome, String email){
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String novoEmail) {
		this.email = email;
	}
	
	public String toString() {
		return nome + ", " + email;
	}
}
