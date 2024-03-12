package entities;

import java.util.ArrayList;
import java.util.List;

public class FCFS {
	private int id;
	private int duracao;
	private List<FCFS> ordem = new ArrayList<>();
	
	public FCFS(int id, int duracao) {
		this.id = id;
		this.duracao = duracao;
	}
	
	public int getId() {
		return id;
	}

	public int getDuracao() {
		return duracao;
	}

	public void ordenaProcessos(FCFS processo) {
		ordem.add(processo);
	}
	
	public void retornaProcessos() {
		int tempoAtual = 0;
		int tempoMedio = 0;
		int contadorProcessos = 0;
		System.out.println();
		
		for(FCFS p : ordem) {
			System.out.println("Processo " + (contadorProcessos + 1) + " (" + p.getId() + ") executou de " + tempoAtual + " a " + (tempoAtual + p.getDuracao()) + " ms");
			tempoMedio = tempoMedio + tempoAtual;
			tempoAtual += p.getDuracao();
			contadorProcessos++;
		}
		
		System.out.print("\nTempo médio de espera: " + (tempoMedio) / contadorProcessos + " ms");
		
	}
}
