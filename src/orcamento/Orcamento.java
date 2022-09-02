package orcamento;

import orcamento.situação.*;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private SituacaoOrcamento situacaoOrcamento;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public void aplicarDescontoExtra(){
        BigDecimal descontoExtra = this.situacaoOrcamento.calcularDescontoExtra(this);
        this.valor.subtract(new BigDecimal("0"));
    }

    //Criado apenas getter
    public BigDecimal getValor() {
        return valor;
    }


    public void setSituacao(SituacaoOrcamento situacaoOrcamento) {
        this.situacaoOrcamento = situacaoOrcamento;
    }

    public SituacaoOrcamento getSituacao(){
        return this.situacaoOrcamento;
    }
}
