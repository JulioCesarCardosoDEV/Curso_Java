package programa;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int quantidadeDePessoas = sc.nextInt();
		String[]nomes = new String [quantidadeDePessoas];
		int[]idades = new int [quantidadeDePessoas];
		String pessoaMaisVelha = null;
		int maiorIdade = 0;
		
		for(int i = 0; i<quantidadeDePessoas; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			if(i == 0) {
				pessoaMaisVelha = nomes[i];
				maiorIdade = idades[i];
				
			}else if(idades[i] > maiorIdade) {
				pessoaMaisVelha = nomes[i];
				maiorIdade = idades[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);
		
		sc.close();

	}

}
