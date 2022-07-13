package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;
import java.util.Hashtable;

public class DescontoMaisDeCincoItens extends Desconto{

    public DescontoMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }


    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(0.1));
    }

    @Override
    public boolean verificar(Orcamento orcamento) {
        return orcamento.getQuntidade() > 5;
    }
}
