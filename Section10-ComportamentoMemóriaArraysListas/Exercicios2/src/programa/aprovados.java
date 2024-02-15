package programa;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Quantas alunos você vai digitar? ");
		int quantidadeDePessoas = sc.nextInt();
		String[]nomes = new String[quantidadeDePessoas];
		double[]notas1 = new double[quantidadeDePessoas];
		double[]notas2 = new double[quantidadeDePessoas];
		double[]media = new double[quantidadeDePessoas];
		
		for(int i = 0; i<quantidadeDePessoas; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
			
			media[i] = (notas1[i] + notas2[i])/2;
		}
		
		System.out.println("Alunos aprovados: ");

		for(int i = 0; i<quantidadeDePessoas; i++) {
			if(media[i]>=6) {
				System.out.println(nomes[i]);
			}
		}
		
		
		sc.close();

	}

}
