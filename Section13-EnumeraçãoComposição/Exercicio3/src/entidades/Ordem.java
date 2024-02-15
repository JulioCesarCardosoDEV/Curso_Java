package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.statusDoPedido;

public class Ordem {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private statusDoPedido status;
	private Cliente cliente;
	private List<OrdemDoPedido>items = new ArrayList<>();
	
	public Ordem() {
		
	}

	public Ordem(Date momento, statusDoPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public statusDoPedido getStatus() {
		return status;
	}

	public void setStatus(statusDoPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrdemDoPedido> getItems() {
		return items;
	}
	
	public void adicionarItem(OrdemDoPedido item) {
		items.add(item);
	}
	
	public void removerItem(OrdemDoPedido item) {
		items.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for(OrdemDoPedido item : items) {
			soma += item.valorDessePedido();
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ordem do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Ordem dos pedidos:\n");
		for (OrdemDoPedido item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
