package com.aps.clinica.odonto.email;

import com.aps.clinica.odonto.conta.negocio.Conta;

public interface IEnviarEmail {

    void enviarEmail(Conta conta);

}
