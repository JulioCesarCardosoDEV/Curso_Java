package programa;

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int quantidadesDePessoas = sc.nextInt();
		double[]alturas = new double[quantidadesDePessoas];
		char[]genero = new char[quantidadesDePessoas];
		double maiorAltura = 0;
		double menorAltura = 0;
		int numeroDeHomens = 0;
		double mediaAlturaMulheres = 0;
		double somaAlturaMulheres = 0;
		double quantidadeDeMulheres = 0;
		
		
		for(int i = 0; i<quantidadesDePessoas; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			alturas[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			sc.nextLine();
			genero[i] = sc.nextLine().charAt(0);
			
			if(i ==0) {
				maiorAltura = alturas[i];
				menorAltura = alturas[i];
			}else if(alturas[i]>maiorAltura) {
				maiorAltura = alturas[i];
			}else if(alturas[i]<menorAltura) {
				menorAltura = alturas[i];
			}
			
			if(genero[i] == 'M' || genero[i] == 'm') {
				numeroDeHomens += 1;
			}else if(genero[i] == 'F' || genero[i] == 'f') {
				somaAlturaMulheres += alturas[i];
				quantidadeDeMulheres += 1;
			}
		}
		
		mediaAlturaMulheres = somaAlturaMulheres / quantidadeDeMulheres;
		
		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		System.out.println("Numero de homens = " + numeroDeHomens);
		
		
		sc.close();

	}

}
