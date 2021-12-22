package br.com.sunsystem.loja.desconto;

import java.math.BigDecimal;

import br.com.sunsystem.loja.orcamento.Orcamento;

public class CalcularDesconto {

	public BigDecimal calcular(Orcamento o) {
		Desconto desconto = new DescontoParaQntItens(
				new DescontoParaValoresMaiorQueQuinhentos(
						new SemDesconto()));
		
		return desconto.calcular(o);
	}
}
