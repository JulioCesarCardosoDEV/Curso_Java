package programa;

import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int quantidadePessoas = sc.nextInt();
		
		String []nomes = new String[quantidadePessoas];
		int [] idades = new int[quantidadePessoas];
		double [] alturas = new double[quantidadePessoas];
		double somaAlturas = 0;
		double quantidaDeMenoresDe16Anos = 0;
		
		for(int i = 0; i<quantidadePessoas; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa");
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			
			somaAlturas += alturas[i];
			
			if(idades[i] < 16) {
				quantidaDeMenoresDe16Anos += 1;
			}
			
		}
		
		double mediaAlturas = somaAlturas / quantidadePessoas;
		double porcentagemMenores = (quantidaDeMenoresDe16Anos / quantidadePessoas)* 100;
		
		System.out.printf("%nAltura media: %.2f%n", mediaAlturas);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenores);
		for(int i=0; i<quantidadePessoas; i++) {
			if(idades[i]<16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();

	}

}
