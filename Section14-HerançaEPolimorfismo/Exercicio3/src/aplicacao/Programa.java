package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuintes;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {
	public static void main(String[]args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	List<Contribuintes>listaDeContribuintes = new ArrayList<>();
	
	System.out.print("Entre com o número de Contribuintes: ");
	int quantidadeDeContribuintes = sc.nextInt();
	
	for(int i=0; i<quantidadeDeContribuintes; i++) {
		System.out.println("Dados do #" + (i + 1) + " Contribuinte: ");
		System.out.print("Pessoa Fisíca ou Jurídica (f/j)? ");
		char tipoDeContribuinte = sc.next().charAt(0);
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Rendimento anual: ");
		double rendimentoAnual = sc.nextDouble();
		
		if(tipoDeContribuinte == 'f' || tipoDeContribuinte == 'F') {
			System.out.print("Gastos médicos: ");
			double gastosMedicos = sc.nextDouble();
			
			listaDeContribuintes.add(new PessoaFisica(nome, rendimentoAnual, gastosMedicos));
		}else if(tipoDeContribuinte == 'j' || tipoDeContribuinte == 'J'){
			System.out.print("Número de funcionários: ");
			int numeroDeFuncionarios = sc.nextInt();
			
			listaDeContribuintes.add(new PessoaJuridica(nome, rendimentoAnual, numeroDeFuncionarios));
		}
	}
	
	System.out.println();
	System.out.println("Impostos pagos: ");
	double ContadorTaxas = 0;
	for(Contribuintes cnt : listaDeContribuintes) {
		System.out.println(cnt.getNome() + ": $ " + String.format("%.2f", cnt.imposto()));
		ContadorTaxas += cnt.imposto();
		
	}
	
	System.out.println();
	System.out.println("Total Impostos: $ " + ContadorTaxas);
	
		
	sc.close();
	}
}
