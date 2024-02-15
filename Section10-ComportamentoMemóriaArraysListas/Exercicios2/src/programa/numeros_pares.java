package programa;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int quantidadeDeNumeros = sc.nextInt();
		int [] numeros = new int [quantidadeDeNumeros];
		int contadorNumerosPares = 0;
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.printf("%nNUMEROS PARES: %n");
		for(int i = 0; i<numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				contadorNumerosPares += 1;
				System.out.printf("%d %n", numeros[i]);
			}
		}
		
		System.out.printf("%nQUANTIDADE DE PARES = %d", contadorNumerosPares);
		
		sc.close();

	}

}
