package br.com.sunsystem.loja.pedido.acoes;

import br.com.sunsystem.loja.interfaces.AcaoAposGerarPedido;
import br.com.sunsystem.loja.pedido.Pedido;

public class Email implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido p) {
		System.out.println("Enviando email c/ dados do Pedido...");
	}
}
