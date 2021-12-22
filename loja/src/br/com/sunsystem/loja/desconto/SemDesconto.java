package br.com.sunsystem.loja.desconto;

import java.math.BigDecimal;

import br.com.sunsystem.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento o) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean isDescontoAplicavel(Orcamento o) {
		return true;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento o) {
		// TODO Auto-generated method stub
		return null;
	}
}
