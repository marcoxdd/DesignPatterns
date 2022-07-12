package orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer quntidade;

    public Orcamento(BigDecimal valor, Integer quantidade) {
        this.valor = valor;
        this.quntidade = quantidade;
    }

    public Integer getQuntidade() {
        return quntidade;
    }

    //Criado apenas getter
    public BigDecimal getValor() {
        return valor;
    }


}
