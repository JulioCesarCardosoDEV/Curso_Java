import java.util.Locale;
import java.util.Scanner;
import entidades.Funcionario;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		funcionario.salario = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println(funcionario.dadosFuncionario());
		
		System.out.println();
		System.out.print("Digite a porcentagem de aumento de salario se houver: ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentoDeSalario(porcentagem);
		
		System.out.println();
		System.out.println(funcionario.toString());
		
		
		
		
		
		sc.close();

	}

}
