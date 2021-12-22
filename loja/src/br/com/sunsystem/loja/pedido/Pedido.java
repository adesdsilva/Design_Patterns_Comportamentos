package br.com.sunsystem.loja.pedido;

import java.time.LocalDateTime;

import br.com.sunsystem.loja.orcamento.Orcamento;

public class Pedido {

	private String cliente;
	
	private LocalDateTime dataPedido;
	
	private Orcamento orcamento;
	
	public Pedido(String cliente, LocalDateTime dataPedido, Orcamento orcamento) {
		this.cliente = cliente;
		this.dataPedido = dataPedido;
		this.orcamento = orcamento;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDateTime dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	
	
}
