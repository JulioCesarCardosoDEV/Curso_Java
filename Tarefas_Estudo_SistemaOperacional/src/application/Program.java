package application;

import java.util.Scanner;

import entities.FCFS;

public class Program {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de processos: ");
		int quantidade = sc.nextInt();
		
		FCFS processo = null;
		FCFS escalonador = new FCFS(-1, -1);
		 
		for(int i = 0; i < quantidade; i++) {
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Duração: ");
			int duracao = sc.nextInt();
			
			processo = new FCFS(id, duracao);
			escalonador.ordenaProcessos(processo);
		}
		
		escalonador.retornaProcessos();;
		
		sc.close();
	}
}
