import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite quantidade de alturas: ");
		int quantidadeAltura = sc.nextInt();
		
		double[]alturas = new double[quantidadeAltura];
		
		double media = 0;
		
		for(int i=0; i<alturas.length; i++) {
			System.out.print("Digite uma altura: ");
			alturas[i] = sc.nextDouble();
			
			media = media + alturas[i];
		}
		
		System.out.printf("%nMEDIA: %.2f", media/quantidadeAltura);
		
		
		sc.close();

	}

}
