package br.com.sunsystem.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

	private String nomeCliente;
	
	private BigDecimal valorOrcamento;
	
	private int qntItensPedido;
	
	public GeraPedido(String nomeCliente, BigDecimal valorOrcamento, int qntItensPedido) {
		this.nomeCliente = nomeCliente;
		this.valorOrcamento = valorOrcamento;
		this.qntItensPedido = qntItensPedido;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQntItensPedido() {
		return qntItensPedido;
	}
	
}
