package programa;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int quantidadeDeNumeros = sc.nextInt();
		double[]numeros = new double [quantidadeDeNumeros];
		double maiorNumero = 0;
		int posicaoMaiorValor = 0;
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			
			if(i==0) {
				maiorNumero = numeros[i];
			}else if(numeros[i]>maiorNumero) {
				maiorNumero = numeros[i];
				posicaoMaiorValor = i;
			}
		}
		
		System.out.printf("%nMAIOR VALOR = %.1f%n", maiorNumero);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaiorValor);
		
		
		
		
		sc.close();

	}

}
