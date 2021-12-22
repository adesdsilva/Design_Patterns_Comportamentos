package br.com.sunsystem.loja.orcamento;

import java.math.BigDecimal;

import br.com.sunsystem.loja.orcamento.situacao.EmAnalise;
import br.com.sunsystem.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;

	private int qntItens;
	
	private SituacaoOrcamento situacao;
	
	public Orcamento(BigDecimal valor, int qntItens) {
		this.valor = valor;
		this.qntItens = qntItens;
		this.situacao = new EmAnalise();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQntItens() {
		return qntItens;
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal vlDescontoExtra = this.situacao.calculaVlDescontoExtra(this);
		this.valor = this.valor.subtract(vlDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
	
	

}
