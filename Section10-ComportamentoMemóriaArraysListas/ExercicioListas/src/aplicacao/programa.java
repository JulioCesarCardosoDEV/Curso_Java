package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidades.empregado;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<empregado>list = new ArrayList<empregado>();
		
		empregado emp = new empregado();
		
		System.out.print("Quantos funcionários serão registrados? ");
		int quantidadeDeFuncionarios = sc.nextInt();
		
		for(int i = 0; i<quantidadeDeFuncionarios; i++) {
			System.out.printf("%nFuncionário #" + (i + 1) + ":%n");
			
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			emp = new empregado(id, nome, salario);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Entre com o ID do funcionário que receberá um aumento: ");
		int novoId = sc.nextInt();
		Integer pos = hasId(list, novoId);
		if(pos == null) {
			System.out.println("Esse Id não existe");
		}else {
			System.out.print("Entre com a porcentagem de aumento: ");
			int porcentagem = sc.nextInt();
			list.get(pos).salarioAcrescentado(porcentagem);
		}
		
		System.out.printf("%nLista de empregados: %n");
		
		for(empregado empe : list) {
			System.out.println(empe);
		}
		
		
		sc.close();
	}
	
	public static Integer hasId(List<empregado> list, int id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
