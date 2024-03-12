package entities;

import java.util.ArrayList;
import java.util.List;

public class SJF {
    private int id;
    private int duracao;
    private int processo;
    private List<SJF> ordem;

    public SJF(int id, int duracao, int processo) {
        this.id = id;
        this.duracao = duracao;
        this.processo = processo;
        ordem = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getDuracao() {
        return duracao;
    }
    
    public int getProcesso() {
    	return processo + 1;
    }
    
    public void adicionaProcesso(SJF processo) {
        ordem.add(processo);
    }

    public void retornaProcessos() {
    	int n = ordem.size(), tempoAtual = 0, tempoMedio = 0, contadorProcessos = 0;
    
        for (int i = 0; i < n ; i++) {
            // Últimos i elementos já estão no lugar certo
            for (int j = 1 + i; j < n; j++) {
                // Comparando elementos adjacentes
                if (ordem.get(i).getDuracao() > ordem.get(j).getDuracao()) {
                    // Troca se o elemento na posição j for maior que o próximo
                    SJF temp = ordem.get(i);
                    ordem.set(i, ordem.get(j));
                    ordem.set(j, temp);
                }
            }
        }

        System.out.println();

        for (SJF p : ordem) {
            System.out.println("Processo " + (p.getProcesso()) + " (" + p.getId() + ") executou de " + tempoAtual + " a " + (tempoAtual + p.getDuracao()) + " ms");
            tempoMedio += tempoAtual;
            tempoAtual += p.getDuracao();
            contadorProcessos++;
        }

        System.out.print("\nTempo médio de espera: " + (tempoMedio / contadorProcessos) + " ms");
    }
}
