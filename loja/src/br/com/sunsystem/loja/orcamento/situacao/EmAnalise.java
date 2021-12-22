package br.com.sunsystem.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.sunsystem.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {

	public BigDecimal calcularVlDescontoExtra(Orcamento o) {
		return o.getValor().multiply(new BigDecimal("0.05"));
	}
	
	public void aprovar(Orcamento o) {
		o.setSituacao(new Aprovado());
	}
	
	public void reprovar(Orcamento o) {
		o.setSituacao(new Reprovado());
	}
}
