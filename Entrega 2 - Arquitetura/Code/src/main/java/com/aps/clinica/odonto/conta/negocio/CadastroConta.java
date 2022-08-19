package com.aps.clinica.odonto.conta.negocio;

import com.aps.clinica.odonto.conta.dados.IRepositorioConta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastroConta {

    @Autowired
    private IRepositorioConta repositorioConta;

    public void novaConta(Conta conta){
        repositorioConta.novaConta(conta);
    }

}
