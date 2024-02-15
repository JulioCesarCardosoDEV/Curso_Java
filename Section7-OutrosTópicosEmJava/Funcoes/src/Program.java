import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 números inteiros");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("Maior = " + n1);
		}
		else if(n2 > n3) {
			System.out.println("Maior = " + n2);
		}
		else
			System.out.println("Maior = " + n3);
		
		
		sc.close();
	}
	


}
