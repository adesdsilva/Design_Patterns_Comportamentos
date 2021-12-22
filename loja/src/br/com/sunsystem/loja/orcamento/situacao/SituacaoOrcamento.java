package br.com.sunsystem.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.sunsystem.loja.exceptions.DomainException;
import br.com.sunsystem.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calculaVlDescontoExtra(Orcamento o) {
		return BigDecimal.ZERO;
	}

	public void aprovar(Orcamento o) {
		throw new DomainException("Orçamento nao pode ser aprovado!");
	}
	
	public void reprovar(Orcamento o) {
		throw new DomainException("Orçamento nao pode ser reprovado!");
	}
	
	public void finalizar(Orcamento o) {
		throw new DomainException("Orçamento nao pode ser finalizado!");
	}
}
