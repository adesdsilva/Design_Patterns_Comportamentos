import java.math.BigDecimal;

import br.com.sunsystem.loja.imposto.CalcularImposto;
import br.com.sunsystem.loja.imposto.ICMS;
import br.com.sunsystem.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento o1 = new Orcamento(new BigDecimal(100), 0);
		CalcularImposto ci1 = new CalcularImposto();
		System.out.println(ci1.calcular(o1, new ICMS()));
	}

}
