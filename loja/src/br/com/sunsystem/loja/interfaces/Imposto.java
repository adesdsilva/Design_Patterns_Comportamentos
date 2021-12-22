package br.com.sunsystem.loja.interfaces;

import java.math.BigDecimal;

import br.com.sunsystem.loja.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento o);
}
