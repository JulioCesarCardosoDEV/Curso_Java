import java.util.Scanner;

public class ProgramComFuncao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 números inteiros");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int maior = max(n1, n2, n3);
		
		showResult(maior);
		
		sc.close();
	}
	
	public static int max(int a, int b, int c) {
		int aux;
		if(a > b && a > c) {
			aux = a;
		}
		else if(b > c) {
			aux = b;
		}
		else
			aux = c;
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Maior = " + value);
	}

}
