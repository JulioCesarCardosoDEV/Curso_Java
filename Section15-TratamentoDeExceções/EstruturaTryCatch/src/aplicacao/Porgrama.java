package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Porgrama {
	public static void main(String[] args) {
		metodo1();
		System.out.println("Fim do programa");
	}
	
	public static void metodo1() {
		System.out.println("Metodo 1");
		metodo();
		System.err.println("Fim método 1");
	}
	
	public static void metodo() {
		System.out.println("Metodo 2 start");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vetor = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vetor[posicao]);
			
			// InputMismatchException, ArrayIndexOutOfBoundsException
			
			System.out.println("Fim do programa");
		}catch(InputMismatchException e) {
			System.out.println("Não é aceito letras!");
			e.printStackTrace();
			sc.next();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
		}
		
		System.out.println("Metodo 2 fim");
		
		sc.close();
	}
}
