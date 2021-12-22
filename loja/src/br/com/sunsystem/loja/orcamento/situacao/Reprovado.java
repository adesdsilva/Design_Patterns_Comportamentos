package br.com.sunsystem.loja.orcamento.situacao;

import br.com.sunsystem.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	public void finalizar(Orcamento o) {
		o.setSituacao(new Finalizado());
	}
}
