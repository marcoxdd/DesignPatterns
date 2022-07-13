package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{
    public SemDesconto(Desconto proximo) {
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
