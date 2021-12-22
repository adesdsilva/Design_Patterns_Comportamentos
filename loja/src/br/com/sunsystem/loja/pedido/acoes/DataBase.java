package br.com.sunsystem.loja.pedido.acoes;

import br.com.sunsystem.loja.interfaces.AcaoAposGerarPedido;
import br.com.sunsystem.loja.pedido.Pedido;

public class DataBase implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido p) {
		System.out.println("Salvando Pedido no DB...");
	}
}
