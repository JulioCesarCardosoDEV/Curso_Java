package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTercerizado;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.print("Entre com o número de funcionários: ");
		int quantidadeDeFuncionarios = sc.nextInt();
		
		for(int i = 0; i<quantidadeDeFuncionarios; i++) {
			System.out.println("Dados do funcionário #" + (i+1) + ":");
			System.out.print("Tercerizado (s/n)? ");
			char tercerizado = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nomeDoFuncionario = sc.nextLine();
			System.out.print("Horas: ");
			int horasTrabalhadasDoFuncionario = sc.nextInt();
			System.out.print("Valor ganho por hora: ");
			double valorGanhoPorHoraDoFuncionario = sc.nextDouble();
			
			if(tercerizado == 's') {
				System.out.print("Valor adicionado (tercerização): ");
				double valorAdicionadoAoFuncionarioTercerizado = sc.nextDouble();
				funcionarios.add(new FuncionarioTercerizado(nomeDoFuncionario, horasTrabalhadasDoFuncionario, valorGanhoPorHoraDoFuncionario, valorAdicionadoAoFuncionarioTercerizado));
				}
			else{
				funcionarios.add(new Funcionario(nomeDoFuncionario, horasTrabalhadasDoFuncionario, valorGanhoPorHoraDoFuncionario));
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos: ");
		
		for(Funcionario fun : funcionarios) {
			System.out.println(fun);
		}
		
		sc.close();

	}

}
