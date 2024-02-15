package programa;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int quantidadeDeValores = sc.nextInt();
		int []vetorA = new int [quantidadeDeValores];
		int []vetorB = new int [quantidadeDeValores];
		int []vetorC = new int [quantidadeDeValores];
		
		System.out.println("Digite os valores do vetor A: ");
		
		for(int i = 0; i<quantidadeDeValores; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		
		for(int i=0; i<quantidadeDeValores; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTATE: ");
		
		for(int i=0; i<quantidadeDeValores; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		
		sc.close();

	}

}
