package br.com.sunsystem.loja.imposto;

import java.math.BigDecimal;

import br.com.sunsystem.loja.interfaces.Imposto;
import br.com.sunsystem.loja.orcamento.Orcamento;

public class ISS implements Imposto {

	public BigDecimal calcular(Orcamento o) {
		return o.getValor().multiply(new BigDecimal("0.06"));
	}
}
