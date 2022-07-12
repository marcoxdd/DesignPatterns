package orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    //Criado apenas getter
    public BigDecimal getValor() {
        return valor;
    }


}
