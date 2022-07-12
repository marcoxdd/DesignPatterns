package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDescontos {


    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoMaisDeCincoItens(
                new DescontoValorMaiorQueQuinhentos(
                        new SemDesconto(null)));

        return desconto.calcular(orcamento);
    }





}
