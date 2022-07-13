package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValorMaiorQueQuinhentos extends Desconto{

    public DescontoValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(0.05));
    }


    @Override
    public boolean verificar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal(500)) > 0;
    }
}
