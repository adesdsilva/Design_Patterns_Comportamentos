import java.math.BigDecimal;

import br.com.sunsystem.loja.desconto.CalcularDesconto;
import br.com.sunsystem.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento o1 = new Orcamento(new BigDecimal(200), 6);
		Orcamento o2 = new Orcamento(new BigDecimal(1000), 2);
		CalcularDesconto cd1 = new CalcularDesconto();
		System.out.println(cd1.calcular(o1));
		System.out.println(cd1.calcular(o2));
	}

}
