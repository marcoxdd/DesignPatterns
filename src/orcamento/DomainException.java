package orcamento;

import orcamento.*;
import orcamento.situação.*;

public class DomainException extends RuntimeException{
    private static final long serialVersionID = 1L;


    public DomainException(String mensagem) {
        super(mensagem);
    }

    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

    public void reprovar(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }
}
