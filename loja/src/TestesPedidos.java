import java.math.BigDecimal;
import java.util.Arrays;

import br.com.sunsystem.loja.pedido.GeraPedido;
import br.com.sunsystem.loja.pedido.PedidoHandler;
import br.com.sunsystem.loja.pedido.acoes.DataBase;
import br.com.sunsystem.loja.pedido.acoes.Email;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Adelino Santos";
		BigDecimal vlOrcamento = new BigDecimal("5000");
		int qntItens = 3;
		
		GeraPedido geraPedido = new GeraPedido(cliente, vlOrcamento, qntItens);
		PedidoHandler handler = new PedidoHandler(
				Arrays.asList(new DataBase(), new Email()));
		handler.execute(geraPedido);
	}

}
