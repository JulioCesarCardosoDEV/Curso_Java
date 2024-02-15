package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.empregado2;

public class programa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		empregado2 emp = new empregado2();
		
		List <empregado2>list = new ArrayList<empregado2>();
		
		System.out.print("Quantos funcionários serão registrados? ");
		int quantidadeDeFuncionarios = sc.nextInt();
		
		for(int i = 0; i<quantidadeDeFuncionarios; i++) {
			System.out.printf("%nFuncionário #" + (i + 1) + ":%n");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			emp = new empregado2(id, nome, salario);
			
			list.add(emp);
		}
		System.out.println();
		System.out.print("Entre com o id do funcionário que receberá um aumento: ");
		int idDoAumento = sc.nextInt();
		Integer pos = checagemId(list, idDoAumento);
		if(pos == null) {
			System.out.printf("Esse id não existe%n");
		}else {
			System.out.print("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			
			list.get(pos).calculaReajusteDoSalario(porcentagem);
		}
		
		System.out.printf("%nLista de empregados: %n");
		
		for(empregado2 funcionario : list) {
			System.out.println(funcionario);
		}
		
		sc.close();
	}
	
	public static Integer checagemId(List<empregado2> list, int id) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
