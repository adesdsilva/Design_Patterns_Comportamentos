package br.com.sunsystem.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.sunsystem.loja.interfaces.AcaoAposGerarPedido;
import br.com.sunsystem.loja.orcamento.Orcamento;

public class PedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
	
	public PedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido geraPedido) {
		Orcamento o = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQntItensPedido());
		Pedido p1 = new Pedido(geraPedido.getNomeCliente(), LocalDateTime.now(), o);

		acoes.forEach(a -> a.executarAcao(p1));
	}
}
