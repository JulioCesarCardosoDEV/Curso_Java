package programa;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int quantidadeNumeros = sc.nextInt();
		
		double []numeros = new double[quantidadeNumeros];
		double soma = 0;
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
			
			soma = soma + numeros[i];
		}
		
		double media = soma / quantidadeNumeros;
		
		System.out.printf("%nVALORES = ");
		for(int i = 0; i<numeros.length; i++) {
			System.out.printf("%.1f ", numeros[i]);
		}
		System.out.printf("%nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();

	}

}
