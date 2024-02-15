package programa;

import java.util.Locale;
import java.util.Scanner;

public class negativos {

	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Quantos números você vai digitar ? ");
			int quantidadeNumeros = sc.nextInt();
			
			if(quantidadeNumeros > 10 || quantidadeNumeros < 1) {
				throw new Exception();
			}
			
			int []numeros = new int [quantidadeNumeros];
			
			for(int i=0; i<quantidadeNumeros; i++) {
				System.out.print("Digite um numero: ");
				int numero = sc.nextInt();
				
				if(numero < 0) {
					numeros[i] = numero;
				}
			}
			
			System.out.println("NUMEROS NEGATIVOS: ");
			
			for(int i=0;i<quantidadeNumeros;i++) {
				if(numeros[i]<0) {
					System.out.println(numeros[i]);
				}
				
			}
		}
		catch (Exception e) {
			System.out.println();
			System.out.println("ERRO: Número maior que 10 ou menor que 1");
		}
		
		
		sc.close();

	}

}
