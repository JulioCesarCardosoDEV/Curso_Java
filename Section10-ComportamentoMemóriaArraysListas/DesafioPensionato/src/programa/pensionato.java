package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluguel;

public class pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados? ");
		int quantidadeDeQuartos = sc.nextInt();
		
		Aluguel aluguel = new Aluguel();
		
		Aluguel[]quartos = new Aluguel[10];
		
		for(int i = 1; i<=quantidadeDeQuartos; i++) {
			System.out.println("Aluguel #" + (i) +":");
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			aluguel = new Aluguel(nome, email);
			
			quartos[quarto] = aluguel;
			System.out.println();
		}
		
		System.out.println("Quartos ocupados: ");
		
		for(int i = 0; i<10; i++) {
			if(quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
		
		
		
		sc.close();

	}

}
