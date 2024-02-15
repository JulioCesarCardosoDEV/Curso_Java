package programa;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int quantidadeDeElementos = sc.nextInt();
		double []numeros = new double [quantidadeDeElementos];
		double somaNumerosPares = 0;
		double contadorNumerosPares = 0;
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			
			if(numeros[i] %2 == 0) {
				somaNumerosPares += numeros[i];
				contadorNumerosPares += 1;
			}
		}
		
		double media = somaNumerosPares / contadorNumerosPares;
		
		if(somaNumerosPares != 0) {
			System.out.printf("%nMEIDA DOS PARES = %.1f%n", media);
		}else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		
		
		
		
		
		sc.close();

	}

}
