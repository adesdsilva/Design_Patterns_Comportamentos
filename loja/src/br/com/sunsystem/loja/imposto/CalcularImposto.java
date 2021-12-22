package br.com.sunsystem.loja.imposto;

import java.math.BigDecimal;

import br.com.sunsystem.loja.interfaces.Imposto;
import br.com.sunsystem.loja.orcamento.Orcamento;

public class CalcularImposto {
	
	public BigDecimal calcular(Orcamento o, Imposto imposto) {
		return imposto.calcular(o);
	}

}
