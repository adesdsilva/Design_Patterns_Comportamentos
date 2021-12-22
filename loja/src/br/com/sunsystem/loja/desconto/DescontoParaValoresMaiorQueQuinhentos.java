package br.com.sunsystem.loja.desconto;

import java.math.BigDecimal;

import br.com.sunsystem.loja.orcamento.Orcamento;

public class DescontoParaValoresMaiorQueQuinhentos extends Desconto {

	public DescontoParaValoresMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean isDescontoAplicavel(Orcamento o) {
		return o.getValor().compareTo(new BigDecimal("500")) > 0;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento o) {
		return o.getValor().multiply(new BigDecimal("0.05"));
	}
}
