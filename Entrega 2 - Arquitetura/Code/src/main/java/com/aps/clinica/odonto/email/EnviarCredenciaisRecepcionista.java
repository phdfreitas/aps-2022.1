package com.aps.clinica.odonto.email;

import com.aps.clinica.odonto.conta.negocio.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnviarCredenciaisRecepcionista implements IEnviarEmail {

    @Autowired
    private EnviarEmailAdapter enviarCredenciaisAdapter;

    @Override
    public void enviarEmail(Conta conta) {
        enviarCredenciaisAdapter.enviarEmail(conta);
    }
}
