package com.aps.clinica.odonto.conta.dados;

import com.aps.clinica.odonto.conta.negocio.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositorioConta implements IRepositorioConta{

    @Autowired
    private ContaDAO contaDAO;

    @Override
    public void novaConta(Conta conta) {
        contaDAO.save(conta);
    }
}
