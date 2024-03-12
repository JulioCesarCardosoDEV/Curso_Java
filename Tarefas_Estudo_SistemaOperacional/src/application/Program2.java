package application;

import java.util.Scanner;
import entities.SJF;

public class Program2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        SJF escalonador = new SJF(-1, -1, -1);

        System.out.print("Quantidade de processos: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Duração: ");
            int duracao = sc.nextInt();

            SJF processo = new SJF(id, duracao, i);
            escalonador.adicionaProcesso(processo);
        }

        escalonador.retornaProcessos();

        sc.close();
    }
}
