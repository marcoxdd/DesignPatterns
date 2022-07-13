package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaisDeCincoItens extends Desconto{

    public DescontoMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuntidade() > 5){
            return orcamento.getValor().multiply(new BigDecimal(0.1));
        }

        return proximo.calcular(orcamento);
    }
}
