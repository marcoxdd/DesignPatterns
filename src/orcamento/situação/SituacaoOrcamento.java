package orcamento.situação;

import orcamento.*;

import java.math.*;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Não pode ser Aprovado");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Não pode ser Reprovado");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Não pode ser Finalizado");
    }
}
