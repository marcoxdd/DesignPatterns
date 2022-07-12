import imposto.CalculadoraImpostos;
import imposto.ICMS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(100), 2);
        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
        System.out.println(calculadoraImpostos.calcular(orcamento, new ICMS()));
    }
}
