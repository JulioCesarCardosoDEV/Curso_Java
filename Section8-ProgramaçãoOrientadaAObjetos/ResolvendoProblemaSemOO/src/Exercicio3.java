import java.util.Locale;
import java.util.Scanner;
import entidades.Notas;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas notas = new Notas();
		
		System.out.print("Digite o nome do aluno: ");
		notas.nome = sc.nextLine();
		System.out.print("Digite a nota 1: ");
		notas.nota1 = sc.nextDouble();
		System.out.print("Digite a nota 2: ");
		notas.nota2 = sc.nextDouble();
		System.out.print("Digite a nota 3: ");
		notas.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Nota final = %.2f %n", notas.calculoNota());
		
		if(notas.calculoNota()< 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltando %.2f pontos %n", notas.pontosQueFaltaram());
		}else {
			System.out.println("Aprovado");
		}
		
		
		
		
		sc.close();

	}

}
