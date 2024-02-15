package programa;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int quantidadeDeElementos = sc.nextInt();
		double []numeros = new double [quantidadeDeElementos];
		double somaElementos = 0;
		
		for(int i = 0; i<quantidadeDeElementos; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
			somaElementos += numeros[i];
		}
		
		double media = somaElementos / quantidadeDeElementos;
		
		System.out.printf("%nMEDIA DO VALOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for(int i = 0; i<quantidadeDeElementos; i++) {
			if(numeros[i] < media) {
				System.out.println(numeros[i]);
			}
		}
		
		
		
		
		sc.close();

	}

}
