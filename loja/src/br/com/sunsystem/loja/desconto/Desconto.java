package br.com.sunsystem.loja.desconto;

import java.math.BigDecimal;

import br.com.sunsystem.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public BigDecimal calcular(Orcamento o) {
		if(isDescontoAplicavel(o)) {
			return efetuarCalculo(o);
		}
		return proximo.calcular(o);
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento o);
	protected abstract boolean isDescontoAplicavel(Orcamento o);
	
}
