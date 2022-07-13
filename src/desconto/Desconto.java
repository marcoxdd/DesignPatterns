package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(verificar(orcamento))return efeturarCalculo(orcamento);
        else return proximo.efeturarCalculo(orcamento);
    }

    protected abstract BigDecimal efeturarCalculo(Orcamento orcamento);
    protected abstract boolean verificar(Orcamento orcamento);

}
