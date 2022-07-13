package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{
    public SemDesconto(Desconto proximo) {
        super(null);
    }


    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean verificar(Orcamento orcamento) {
        return true;
    }
}
