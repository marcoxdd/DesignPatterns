package orcamento.situação;

import orcamento.*;

import java.math.*;

public class Aprovado extends SituacaoOrcamento{
    public BigDecimal calcularDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
