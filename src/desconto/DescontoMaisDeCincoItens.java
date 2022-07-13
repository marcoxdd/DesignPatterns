package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaisDeCincoItens extends Desconto{

    public DescontoMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efeturarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(0.1));
    }

    @Override
    protected boolean verificar(Orcamento orcamento) {
        return orcamento.getQuntidade() > 5;
    }
}
