package br.com.sunsystem.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.sunsystem.loja.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {

	public BigDecimal calcularVlDescontoExtra(Orcamento o) {
		return o.getValor().multiply(new BigDecimal("0.02"));
	}
	
	@Override
	public void finalizar(Orcamento o) {
		o.setSituacao(new Finalizado());
	}
	
}
