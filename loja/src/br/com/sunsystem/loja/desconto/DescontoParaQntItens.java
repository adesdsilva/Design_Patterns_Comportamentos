package br.com.sunsystem.loja.desconto;

import java.math.BigDecimal;

import br.com.sunsystem.loja.orcamento.Orcamento;

public class DescontoParaQntItens extends Desconto {

	public DescontoParaQntItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean isDescontoAplicavel(Orcamento o) {
		return o.getQntItens() > 5;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento o) {
		return o.getValor().multiply(new BigDecimal("0.1"));
	}
}
