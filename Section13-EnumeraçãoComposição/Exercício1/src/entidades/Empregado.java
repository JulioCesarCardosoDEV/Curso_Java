package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelDoFuncionario;

public class Empregado {
	private String nome;
	private NivelDoFuncionario nivel;
	private double salarioBase;
	private Departamento departamento;
	private List<ContratoComHoras>contratos = new ArrayList<>();
	
	public Empregado() {
		
	}
	
	public Empregado(String nome, NivelDoFuncionario nivel, double salarioBase, Departamento departamento) {
		
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public NivelDoFuncionario getNivel() {
		return nivel;
	}
	public void setNivel(NivelDoFuncionario nivel) {
		this.nivel = nivel;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public List<ContratoComHoras> getContratos() {
		return contratos;
	}
	
	public void adicionarContrato(ContratoComHoras contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(ContratoComHoras contrato) {
		contratos.remove(contrato);
	}
	
	public double salarioTotal(Integer ano, Integer mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for(ContratoComHoras c : contratos) {
			cal.setTime(c.getData());
			int c_mes = 1 + cal.get(Calendar.MONTH);
			int c_ano = cal.get(Calendar.YEAR);
			if(mes == c_mes && ano == c_ano) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
	
	
}
